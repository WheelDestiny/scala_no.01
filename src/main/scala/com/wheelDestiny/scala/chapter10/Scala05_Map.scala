package com.wheelDestiny.scala.chapter10

import scala.collection.mutable


object Scala05_Map {
  def main(args: Array[String]): Unit = {
    //Map集合：K-V对
    //scala中k-v对使用特殊的方式声明
    val map = Map("a" -> (1), "b" -> (2), "c" -> (3))

    val tuple = "d" -> (4)
    val map1 = map + tuple
//    println(map1.mkString(","))

    val map2 = map - ("a")
//    println(map2.mkString(","))

    val map3 = map.updated("a", 100)
//    println(map3.mkString(","))

    //获取某个元素
    //scala为了防止集合出现空指针问题，提供了一个特殊的类，option。有两个特殊的对象，Some，None
    //如果确实没有获取到数据，为了不出现异常，Option提供了一个有默认值的方法
    val option = map.get("aa")
//    println(option.get)
    println(option.getOrElse(0))

    //可变Map集合
    val mmap = mutable.Map("a" -> (1), "b" -> (2), "c" -> (3))





  }

}
