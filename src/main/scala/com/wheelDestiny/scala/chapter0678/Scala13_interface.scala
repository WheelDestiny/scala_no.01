package com.wheelDestiny.scala.chapter0678

/**
 * scala中没有接口的概念
 *
 * 有特质（trait）的概念，类似于接口
 *
 */
object Scala13_interface {
  def main(args: Array[String]): Unit = {

    val user = new User13

    println(user)
  }
}

//声明特质
trait TestTrait13{
  def set()
  def get(){}

}
trait TestTrait131{

}

class Person13{

}
class Person131{

}

//trait是可以继承的,所以使用extends关键字
//如果一个类要继承多个特质，用with连接
//如果同时存在父类和trait，依然采用extends
//父类写在extends之后的第一位，继承的trait在后面用with混入(mix)

class User13 extends Person13 with  TestTrait13 with TestTrait131 {
  override def set(): Unit = ???
}
