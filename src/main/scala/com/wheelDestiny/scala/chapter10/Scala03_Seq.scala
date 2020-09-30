package com.wheelDestiny.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


object Scala03_Seq {
  def main(args: Array[String]): Unit = {
    //序列  Seq
    //默认scala提供的集合都是不可变的(immutable)
    val list: List[Int] = List(1, 2, 3, 4)
    val list1: List[Int] = List(5,6,7,8)

    list.length
    //通过索引获取数据
//    println(list(1))
    val ints: List[Int] = list :+ 5
    val ints1: List[Int] = 0+:list

//    list.foreach(println)
//    println(ints1.mkString(" "))

    val ints2 = list ++ list1

    val ints3 = 9::8 :: list

    val ints4 =9:: list1:::list

//    println(ints4.mkString(","))
    //特殊集合，空集合Nil
//    println(List())
//    println(Nil)

    //修改
    val ints5 = list.updated(0,100)
//    println(ints5.mkString(","))

    //删除数据
    val ints6 = list.drop(2)
//    println(ints6.mkString(","))


    //可变集合
    val buffer = ListBuffer(1,2,3,4)

    //集合的属性
    //头
//    println(buffer.head)
//    //除了第一个的后面
//    println(buffer.tail)
//    //尾
//    println(buffer.last)
//    //除了最后一个
//    println(buffer.init)

    //队列(一定是可变的)
    val queue = mutable.Queue(1, 2, 3, 4)

    //入队
    queue.enqueue(5)
    //出队
    val i = queue.dequeue()
    println(i)
    println(queue)

  }

}
