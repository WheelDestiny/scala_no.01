package com.wheelDestiny.scala.chapter0678

/**
 * scala中没有接口的概念
 *
 * 有特质（trait）的概念，类似于接口
 *
 */
object Scala14_interface1 {
  def main(args: Array[String]): Unit = {

    //scala中的trait是无法直接构建对象的

    val user = new User14
    user.test()
    println(user.aaa)
    user.aaa = "111"

  }
}

//声明特质
//scala中trait中可以执行代码
// scala中trait中声明的属性和方法，都可以在混入中的类中调用
trait TestTrait14{
  var aaa ="aaa"

  val s:String

  println("aaaa")

  def test(): Unit ={
    println("a")
  }

  def test1()

}

class Person14{


}

class User14 extends Person14 with  TestTrait14 {
  override val s: String = ""

  override def test1(): Unit = {

  }
}
