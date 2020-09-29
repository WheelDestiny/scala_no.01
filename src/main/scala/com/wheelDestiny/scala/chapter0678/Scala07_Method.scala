package com.wheelDestiny.scala.chapter0678

/**
 *类的方法
 */

//方法
//方法指的就是类中声明的函数，
// 所以声明方式和函数是一样的,
// 主要区别在调用方式上
object Scala07_Method {
  def main(args: Array[String]): Unit = {
    val user = new User07

    user.login()
    val str = user.+("aaa")

    println(str)

  }

}

class User07{
  def login(): Unit ={

  }
  def logout():Boolean ={
    true
  }

}