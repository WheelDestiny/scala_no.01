package com.wheelDestiny.scala.chapter05

object Scala09_Exception {



  //异常
  def main(args: Array[String]): Unit = {
    try {

      val i = 0
      val j = 1
      val k = j/i
    }catch{
      case exception: Exception => {
        println()
        println()
        println()

      }
      case ex:ArithmeticException=> println("ArithmeticException")

    }finally{
      println("finally...")
    }

    println("!!!")




  }
}