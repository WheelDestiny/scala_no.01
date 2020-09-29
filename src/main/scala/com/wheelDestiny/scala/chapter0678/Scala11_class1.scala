package com.wheelDestiny.scala.chapter0678

/**
 * 父类构造方法
 *
 *
 */
object Scala11_class1 {
  def main(args: Array[String]): Unit = {
    val user= new User11("s")


  }
}
class Person11(s:String){
  println("person的主构造方法")

}
//如果父类的主构造方法有参数，那么构建对象时必须显示的传递参数
//可以在继承的父类后面增加  (参数值),等同于调用父类的构造方法
class User11(s: String) extends Person11(s) {

  println("User 主构造")

  def this(s: String,ss:String){
    this(s)
    println("User 的辅助构造方法")
  }
}
