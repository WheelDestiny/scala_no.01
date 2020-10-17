package com.wheelDestiny.scala.chapter13

import scala.util.control.Breaks

object Scala01_AbstractFunction {
  def main(args: Array[String]): Unit = {
//    Breaks.breakable{
//      val i = ""
//    }

    //当参数类型为一个无参无返回值的函数时，可以直接传递代码逻，不需要特别声明一个函数
    //声明方式  =>Unit
    //注，必须用上述的声明方式，不能加()
    def test(b :Boolean)(f : => Unit): Unit ={
      f
    }
    //控制抽象，将一段代码作为参数传递
    test(true){
      println("aa")
      println("aa")
      println("aa")
    }


  }

}
