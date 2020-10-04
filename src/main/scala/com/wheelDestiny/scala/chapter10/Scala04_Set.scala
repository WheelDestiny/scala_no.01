package com.wheelDestiny.scala.chapter10

import scala.collection.mutable


object Scala04_Set {
  def main(args: Array[String]): Unit = {
    /**
     * Set集合，无序，不可重复
     *
     * scala中默认提供的Set集合是不可变的
     */
    val set = Set(1, 2, 3, 4,1)
//    println(set.mkString(","))

    //增加数据
//    println(set + 10)
    //删除数据
//    println(set - 2)

    //可变Set集合
    val ints = mutable.Set(2, 3, 4, 5)




  }

}
