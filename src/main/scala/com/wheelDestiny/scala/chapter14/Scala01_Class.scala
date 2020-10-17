package com.wheelDestiny.scala.chapter14

object Scala01_Class {
  def main(args: Array[String]): Unit = {
    test(new Person)

  }
  //<: 表示泛型的上限，所以传递数据时，应该为子类或者当前类
  //>: 表示泛型的下限，但是此处和java中的下界不同，在编译后的字节码中并没有任何的约束，所以可以传递任何类型
  def test[T >: User](t:T): Unit ={
    println(t)
  }

}
class Person{}
class User extends Person{}
class Child extends User{}
