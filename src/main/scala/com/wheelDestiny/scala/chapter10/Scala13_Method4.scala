package com.wheelDestiny.scala.chapter10

import scala.collection.mutable

object Scala13_Method4 {
  def main(args: Array[String]): Unit = {

    //将两个Map合并，相同的key做累加，不同的key直接添加
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 3, "b" -> 4, "d" -> 5)
    //对map添加元素
    map1("f") = 1

    //循环的是map1，被插入数据的是map2，即被操作的集合对象是map2
    map1.foldLeft(map2)((i,j) => {
      i.put(j._1, i.getOrElse(j._1, 0) + j._2)
      i
    })
    println(map1)
    println(map2)



  }

}
