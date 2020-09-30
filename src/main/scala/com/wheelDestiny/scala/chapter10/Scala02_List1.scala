package com.wheelDestiny.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_List1 {
  def main(args: Array[String]): Unit = {
    //scala中的数组，使用Array对象实现，使用[]声明数组的类型

    val ints = Array((2,3,4),(2,3,4),(2,3,4),(2,3,4))
    val ints2 = Array(1,2,3,4,5)

    Array("aa")

    val length = ints.length
//    println(length)
//    println(ints)
//    println(ints(0))
//
//    println(ints2.mkString("."))
//    for (elem <- ints2) {
//      print(elem)
//    }
//
//    ints2.foreach(println)

    //修改元素
    ints2.update(1,10)
    ints2(2) = 20

    //增加数据,原理是copy旧数据，生成一个新的数组
    val ints1 = ints2 :+ 5//向末尾添加
    val ints3 = 5 +: (ints2)//向头部添加
//    println(ints2.mkString("."))
//    println(ints1.mkString("."))
//    println(ints3.mkString("."))

    //可变数组
    val ints4 = ArrayBuffer(1, 2, 3, 5)
    //修改值
    ints4(0) = 100
    //增加元素
    ints4+=9
    //指定位置增加元素
    ints4.insert(0,90)

    ints4.foreach(println)

    //删除数据
    val i = ints4.remove(1)
    ints4.remove(1,2)
    ints4-=(1)
//    println(i)
    ints4.foreach(println)

    //可变数组和不可变数组的转换
    val buffer: mutable.Buffer[Int] = ints2.toBuffer
    val array: Array[Int] = ints4.toArray


  }

}
