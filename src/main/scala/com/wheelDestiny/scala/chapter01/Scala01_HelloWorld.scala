package com.wheelDestiny.scala.chapter01

object Scala01_HelloWorld {
  //会在编译后自动形成一个main方法
  //scala在编译源码时，会生成两个字节码文件，静态main方法执行另外一个字节码文件中的成员main方法
  //scala是完全面向对象的语言，所以它没有静态的语法，即static关键字，只能通过模拟生成静态方法
  //编译时将当前类生成一个特殊的类-->Scala01_HelloWorld$，然后创建对象来调用这个对象的main方法

  //一般情况下，将加$的类的对象，称之为“伴生对象”
  //伴生对象中的内容，都可以通过类名访问,来模拟java中的静态语法
  //伴生对象的语法规则：使用object关键字声明
  /*
  * public static void main(String[] args){}
  *
  * scala中没有public关键字，默认所有的访问权限都是公共的。
  * 完全面向对象中无法考虑void关键字所代表的含义，所以该关键字不需要声明，采用特殊的对象来模拟：Unit
  * scala中声明方法采用关键字def
  *
  * 方法名后面得()是方法的参数列表
  *
  * scala中参数列表的声明方式和java不一样
  * java: String 参数名
  * scala: 参数名:类型
  *
  * java中方法的声明和方法体是直接连载一起的
  * scala中方法的声明和方法体是通过=连接的
  *
  * scala中将方法的返回值类型放置在方法声明的后面，使用:连接
  *
  * scala中每行结尾不需要加;，但是如果多条语句在一行的情况下则需要在除了最后一条语句之外的语句后加;用以区分
  * */
  def main(args: Array[String]): Unit = {
    println("Hello World")
//    Scala01_HelloWorld.test();
  }
//  def test():Unit = {
//
//  }
}
