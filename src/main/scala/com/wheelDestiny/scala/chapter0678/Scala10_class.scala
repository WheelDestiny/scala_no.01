package com.wheelDestiny.scala.chapter0678

/**
 * 构造方法
 */
object Scala10_class {
  def main(args: Array[String]): Unit = {
    var user = new User10
//    user.name


  }
}
//声明类
//父类，继承
//类可以声明为抽象的
abstract class Person{
  //scala中属性也可以重写，因为属性可以抽象
  var name : String = _

  //为什么？因为在scala中所有的对象都是函数，所有的函数也都是对象
  //在代码编译为class文件时，抽象的属性没有私有的属性实现，只有两个抽象的set，get方法
  var sex :String

  val email:String = "aaa"

  //抽象类中的方法可以只声明方法，不实现方法体，不重要专门加abstract关键字
  def set(s:String):String

  def set1(s:String):String={
    s
  }

}
class User10 extends Person {
  //重写抽象方法
  def set(s: String): String = {
    s
  }

  //重写普通方法
  //scala中如果子类重写父类中的方法，需要增加override关键字
  override def set1(s: String): String = {
    s
  }
  //重写抽象属性
  var sex: String = _

  //重写普通属性
  //属性可以被覆盖(重写),但是不能重写父类中var声明的属性,
  // 因为属性本身其实是一个方法，var声明的属性有get和set方法，
  // 但是因为动态绑定规则，所有的方法都会先从当前内存中寻找，如果我们重写了该属性，
  // 意味着我们无法再获取到父类中的属性，在父类中声明的属性就失去了意义。不过对于val声明的属性来说，只有
  override val email:String = "aaaa"

}
