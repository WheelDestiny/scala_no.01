package com.wheelDestiny.scala.chapter0678

/**
 *类的方法
 */

//方法
//方法指的就是类中声明的函数，所以声明方式和函数是一样的,主要区别在调用方式上
object Scala08_Method1 {
  def main(args: Array[String]): Unit = {
    //采用伴生对象来创建伴生类
    //相当于编译器自动调用了Student.apply
    val student =Student("aa")
    println(student.pname)

    val range = Range(1, 5)
  }

}