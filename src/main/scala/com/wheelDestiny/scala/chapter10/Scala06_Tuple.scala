package com.wheelDestiny.scala.chapter10

import scala.collection.mutable


object Scala06_Tuple {
  def main(args: Array[String]): Unit = {
    //Tuple：元组
    //将无关的数据当成一个整体来使用
    //元组中最多存放22个元素
    val tuple = ("name", 20, true)
//    println(tuple._1)
//    println(tuple._2)
//    println(tuple._3)

//    tuple.productIterator.foreach(println)

    //如果元组中的元素个数为2，那么称之为对偶，类似Map中的键值对
//    val tuple1= (1, "zhao",())
//    tuple1.productIterator.foreach(println)

    val map = Map((2, "2"))
    println(map.get(2).get)
    map.foreach((k)=>{
      k.productIterator.foreach(println)
    })
  }

}
