package com.wheelDestiny.scala.chapter09

object Scala03_Transform2 {
  def main(args: Array[String]): Unit = {
    //隐式值
    implicit val cc:String = "cc"
    implicit val username1:Long = 111
    //隐式参数
    def test( implicit s:String = "bb"): Unit ={
      println("aa"+s)
    }

    test()//方法调用是使用()会导致隐式值无法传递
    test  //方法调用时不使用()可以使用隐式传递值

  }
}

