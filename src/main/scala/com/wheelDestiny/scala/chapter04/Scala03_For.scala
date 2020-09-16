package com.wheelDestiny.scala.chapter04

object Scala03_For {

  def main(args: Array[String]): Unit = {
    //for循环
    //示例：循环从1-3,循环三次
    for (i <- 1 to 3 ){
      println(i)
    }
    1.+(1)

    //Range(start,end) 范围对象，等同于until
    for (i <- Range(0,5)){
      println(i)
    }
    //第三个参数是增长的步长
    for (i <- Range(0,5,2)){
      println(i)
    }

  }
}
