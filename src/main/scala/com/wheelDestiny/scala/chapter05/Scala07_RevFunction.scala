package com.wheelDestiny.scala.chapter05

object Scala07_RevFunction {
  def main(args: Array[String]): Unit = {

    //方法有默认类型，<function+"参数个数">
    val a = ()=>{}
    val b = (x:Int)=>{}
    val c = (x:Int,y:Int)=>{}
    print(a+" "+b+" "+c)

  }
}