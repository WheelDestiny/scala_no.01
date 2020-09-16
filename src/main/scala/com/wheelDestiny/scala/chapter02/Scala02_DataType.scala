package com.wheelDestiny.scala.chapter02

object Scala02_DataType {
  def main(args: Array[String]): Unit = {
    //数据类型

    //scala是完全面向对象的语言，所以没有基本数据类型
    //scala中，数字也是对象，可以调用方法
    val age : Int = 1

    //byte,short,int,long,double,float,char,boolean
    val b :Byte = 10
    val s : Short = 10
    val i : Int = 10
    val l : Long = 10
    val d : Double = 10
    val f : Float = 10
    val c : Char = 10
    val bl : Boolean = true
    //scala中的整型的字面量/常量，默认为Int类型，声明Long类型的常量/字面量需要在后面加L或者l
    val lon = 10000000000L


  }

}
