package com.wheelDestiny.scala.chapter16

import java.io.{File, PrintWriter}

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.Source


/**
 * inputFormat 启动线程后
 *  接收一个地址作为文件输入地址，将每个文件分别发送给一个mapper
 *  同时启动传入的reduceNum个数的reduce个数，将ref作为参数传递给每个mapper
 */

class WordCountInputFormat(reduceNum:Int) extends Actor{
  //保存创建的reduce
  private var reduceRefList: ArrayBuffer[ActorRef] = _
  //actor工厂
  private var actorSystem:ActorSystem = _

  //初始化属性
  override def preStart(): Unit = {
    reduceRefList = new ArrayBuffer[ActorRef]()
    actorSystem = ActorSystem("WordCountDriver")
  }

  override def receive: Receive = {
    case pathStr:String =>{
      //读取文件路径
      val path = new File(pathStr)
      val files: Iterator[File] = path.listFiles().toIterator
      //创建outputFormat线程
      val wordCountOutPutFormatRef: ActorRef = actorSystem.actorOf(Props[WordCountOutputFormat](new WordCountOutputFormat(reduceNum)), s"WordCountOutPutFormat")

      var fileNum = 0
      var filePaths =new ArrayBuffer[File]()
      for(f <- files){
        fileNum+=1
        filePaths+=f
      }

      for(i <- 1 to reduceNum){
        val wcReducer: ActorRef = actorSystem.actorOf(Props[WordCountReducer](new WordCountReducer(fileNum, wordCountOutPutFormatRef,i)), s"reducer${i}")
        reduceRefList+=wcReducer
      }

      //遍历文件路径，有多少文件创建多少mapper,并启动
      var num = 0
      for(f <- filePaths){
        num+=1
        val wcMapper: ActorRef = actorSystem.actorOf(Props[WordCountMapper](new WordCountMapper(reduceRefList,f.toString)), s"mapper${num}")
        wcMapper ! "start"
      }
    }
  }
}

/**
 * mapper的actor，负责数据的初步处理，文件切分，将词处理成kv的形式，最终发送给reducer，所以需要的参数有reducer的地址，以及读取文件的地址
 * 然后根据key分别发给不同的reduce，分区方式可以通过模仿MR的HashPartitioner，
 *    先获取到key的hashcode和Integer.MAX_VALUE做&，保证hashcode为正数，再和设定的reduce个数做%，即可将相同的key分配到同一个reduce中
 * 根据分区号，把数据发送给reduce
 *
 * @param reduceActorRefs reduce列表
 * @param failPath        文件地址
 */
class WordCountMapper(reduceActorRefs:ArrayBuffer[ActorRef],failPath:String) extends Actor {
  override def receive: Receive = {
    //启动mapper端运算
    case "start" =>{
      //将文件转化为string类型的集合
      val list: List[String] = Source.fromFile(failPath).getLines().flatMap(_.split(" ")).toList
      //遍历所有的string转化为(word,1)，把word相同的元组发送给同一个reducer
      for(i <- 0 until list.length){
        val key = list(i)
        //模仿hashPartitioner计算分区，实际上这种分区方式大概率会数据倾斜
        val pNum: Int = (key.hashCode & Integer.MAX_VALUE) % reduceActorRefs.size
        reduceActorRefs(pNum) ! Result(key,1)

        if(i==list.length-1){
          //循环结束后向所有reduce发送mapper端计算结束
          for (reduceRef <- reduceActorRefs){
            reduceRef ! "MapEnd"
          }
        }
      }
    }
  }
}

/**
 * 接收mapper端发送来的(word,1)，用hashmap保存，并记录个数，最后把数据发送给outputFormat做汇总
 *
 * @param mapperNum       mapper个数，用来保证计算时所有的mapper都已经计算完毕
 * @param outputFormatRef outputFormat的地址
 */
class WordCountReducer(mapperNum:Int, outputFormatRef:ActorRef,id:Int) extends Actor{
  //用来保存mapper发送的数据的容器
  private var res : mutable.HashMap[String, Long]= _
  //记录已经完成计算的mapper的数量
  private var endMapNum:Int = _
  //初始化属性
  override def preStart(): Unit = {
    res = new mutable.HashMap[String, Long]()
    endMapNum = 0
  }
  override def receive: Receive = {
    //当接收到mapper发送的数据时，把数据汇总到res中
    case Result(kv) => {
      println(id+"---"+kv)
      res.put(kv._1,res.getOrElse(kv._1, 0L) + kv._2)
      println(id+"---"+res)
    }
    //当接收到mapper发送的结束标记时
    case "MapEnd" =>{
      endMapNum+=1
      println(id+"---"+endMapNum+"----"+mapperNum)
      //当结束计算的mapper数量等于总mapper数量时，将汇总的数据发送给outputFormat
      if(endMapNum == mapperNum){
        outputFormatRef ! reducerResult(res)
      }
    }
    }
}
/**
 * OutputFormat 把所有reducer传来的数据记录合并到一起，当所有的reducer的数据都被记录之后打印
 * @param reduceNum reducer的总个数，用来判断是否所有的reducer都计算完毕
 */
class WordCountOutputFormat(reduceNum:Int) extends Actor {
  //保存reducer传来的数据
  private var outputRes : mutable.HashMap[String, Long]= _
  //记录已经计算结束的reducer
  private var endReducerNum :Int= _

  override def preStart(): Unit = {
    //初始化
    endReducerNum = 0
    outputRes = new mutable.HashMap[String, Long]()
  }
  override def receive: Receive = {
    case reducerResult(res) => {
      //每次传入的hashmap做一个合并
      res.foldLeft(outputRes)( (outputRes,resKV) => {
        //因为实际上相同的key都被分到一个reduce中统计，所以，这里可以不用做累加判断，直接合并就可以了
        //还有一个问题。。。
        outputRes.put(resKV._1,resKV._2)
//        outputRes.put(resKV._1,outputRes.getOrElse(resKV._1,0)+resKV._2)  这里有个报错，实在是没想明白
        outputRes
      })
      //每次传输说明一个reduce计算完毕
      endReducerNum+=1
      //如果计算完毕的reducer数量等于全部的reduce数量，说明全部计算完毕
      if(endReducerNum == reduceNum){
        println(outputRes)
        val writer = new PrintWriter(new File("D:/output/WordCountRes.txt"))
        for(kv <- outputRes){
          writer.println(kv._1+"\t"+kv._2)
        }
        writer.close()
      }
    }
  }
}
//map端的输出类型
case class Result(result : (String,Long))
case class reducerResult(result :mutable.HashMap[String, Long])

object AkkaWordCountMR {
  def main(args: Array[String]): Unit = {
    val driver = ActorSystem("WordCountDriver")
    val wordCountActor: ActorRef = driver.actorOf(Props[WordCountInputFormat](new WordCountInputFormat(4)), "driver")
    wordCountActor ! "D:/input"
  }
}
