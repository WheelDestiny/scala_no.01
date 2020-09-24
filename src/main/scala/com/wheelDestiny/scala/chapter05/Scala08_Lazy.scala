package com.wheelDestiny.scala.chapter05

object Scala08_Lazy {
  //懒加载
  //直到需要用到执行结果的时候才会执行代码
  //lazy不能修饰var类型的变量
  //在调用函数时加lazy会导致函数的执行被推迟
  def main(args: Array[String]): Unit = {
    lazy val res = sum(1,2)
    println("-------")
    println("res = "+res)

  }
  def sum (n1:Int,n2:Int)={
    println("sum = ")
    n1+n2
  }
}