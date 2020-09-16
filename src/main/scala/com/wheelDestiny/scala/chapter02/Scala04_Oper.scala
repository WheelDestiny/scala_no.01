package com.wheelDestiny.scala.chapter02

import scala.io.StdIn

//标识符
object Scala04_Oper {
  def main(args: Array[String]): Unit = {
    var i = 1
    var a = 10
    i+=1
    println(i)

    val b = true

    var u =(a=10)
    println(u)

    var v = 2
    var k = 3

    v = k+v
    k = v-k
    v = v-k
    println(v+" "+k)

    v = v^k
    k = v^k
    v = v^k
    println(v+" "+k)

//    var name = StdIn.readLine()
//    println(name)

  }

}
