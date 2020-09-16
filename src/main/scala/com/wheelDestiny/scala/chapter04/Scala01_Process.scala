package com.wheelDestiny.scala.chapter04

object Scala01_Process {
  def main(args: Array[String]): Unit = {
    var a = "abc".substring(0,1)
    var s = a

    println(a+" "+s)
    //scala中字符串比较还是使用equals进行比较
    if("a".equals(s)){
      println("a")
    }else{
      println(false)
    }
  }

}
