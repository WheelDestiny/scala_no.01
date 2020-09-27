package com.wheelDestiny.scala.chapter0678

/**
 * 面向对象
 * scala是一个完全面向对象的语言
 *
 *
 */
object Scala01_Object {
  def main(args: Array[String]): Unit = {
    //创建类对象
    val user :User = new User()
    //调用对象的属性或方法
    user.name = "aaa"
    val username = user.name
    println(username)
  }

}
//声明类
class User{
  //声明属性
  //默认初始化 =_
  var name:String = _

  var age:Int = _

  def login(): Boolean ={
    true
  }

}
