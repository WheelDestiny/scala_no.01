package com.wheelDestiny.scala.chapter16

import java.io.{File, PrintWriter}

import akka.actor.ActorRef

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object FileTest {
  private val actorRefList: ArrayBuffer[Int] = new ArrayBuffer[Int]()
  def main(args: Array[String]): Unit = {
//    val path = new File("D:/input")
//    val files: Iterator[File] = path.listFiles().toIterator
//    println(files.size)
//    for(f <- files){
//      println(Source.fromFile(f).mkString)
//    }
//    var a = 0
//
//    for (a <- 1 to 10){
//
//    }
    val map1 = Map("key1" -> 1, "key2" -> 3, "key3" -> 5)
    val map2 = Map("key2" -> 4, "key3" -> 6, "key5" -> 10)
    map2("aa")


//    val tuple: (String, String, String) = ("123", "234", "435")




//    val map1: mutable.HashMap[String, Int] = mutable.HashMap("key1" -> 1, "key2" -> 3, "key3" -> 5)
//    val map2:mutable.HashMap[String, Int] = mutable.HashMap("key2" -> 4, "key3" -> 6, "key5" -> 10)

//    (map1 /: map2)((map, kv) => {
//      println(s"map=${map} kv=${kv}")
//      map
//    })
//    map2.foldLeft(map1)((map1,kv) =>{
//      println(s"map=${map1} kv=${kv}")
//      map1.put(kv._1,map1.getOrElse(kv._1,0)+kv._2)
//      map1
//    })
//    println(map1)
//文件写入
//    val writer = new PrintWriter(new File("D:/output/saveTextTitle.txt"))
//    for(i <- 1 to 10)
//      writer.println(i)// 这里是自动换行 不用再加\n 切记切记
//    writer.close()






  }



}
