package com.wheelDestiny.scala.chapter14

object Scala02_Class {
  def main(args: Array[String]): Unit = {
    //不变性，默认情况下，scala中的泛型和java中一样，声明的泛型和实现的泛型必须一样
    val test1 : Test1[User1] = new Test1
    //在scala中，为了丰富泛型的功能，提供了协变和逆变

    val test2 : Test11[User1] = new Test11[Child1]
    val test3 : Test12[User1] = new Test12[Person1]
  }

}
class Person1{}
class User1 extends Person1{}
class Child1 extends User1{}
class Test1[User1]{}
class Test11[+User1]{}
class Test12[-User1]{}
