package com.wheelDestiny.scala.chapter0678

/**
 * scala中没有接口的概念
 *
 * 有特质（trait）的概念，类似于接口
 *
 */
object Scala15_interface2 {
  def main(args: Array[String]): Unit = {
    var user = new User15

  }
}

//特质和父类没有关系，只和当前混入的类有关系，所以在调用时，父类先执行，trait再执行，最后执行当前类
//如果父类和子类混入了相同的trait，那么trait代码只会执行一遍

trait TestTrait15{
  println("trait code...")

}

class Person15 extends TestTrait15{
  println("parent code...")

}

class User15 extends Person15 with  TestTrait15 {
  println("child code...")

}
