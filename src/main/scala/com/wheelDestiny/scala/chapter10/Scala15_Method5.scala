package com.wheelDestiny.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala15_Method5 {
  def main(args: Array[String]): Unit = {
//    val list = List(1, List(2, 3), List(4, 5))
//    //当集合中的元素类型不相同时，需要自行判断根据不同的情况进行处理
//    val list1 = list.flatMap(i => {
//      //判断类型，如果可以是List类型的，直接转型，如果是Int类型，将i转化为List
//      if (i.isInstanceOf[List[Int]]) {
//        i.asInstanceOf[List[Int]]
//      } else {
//        List(i)
//      }
//    })
//    new ArrayBuffer[Int]()

    def a (): Unit ={
      print("aaaa")
    }
    var b = a _
    print(b)

  }
}
