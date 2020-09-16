package com.wheelDestiny.scala.chapter04

object Scala02_Exp {

  def main(args: Array[String]): Unit = {
    val flg = true

    //if的返回值是最后一行代码的返回值
    //if表达式的返回值是Any类型，因为有可能if的条件不满足，最后一行的代码就不会执行
    //但是如果else的返回值也是String，则
    val value:String = if (flg) {
      "aaa"
    }else{
      "bbb"
    }

    println(value)

  }
}
