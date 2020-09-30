package com.wheelDestiny.scala.chapter0678
//伴生类（成员）
class Student(s:String) {
  private val name = s
  val pname = s

}
//伴生对象（静态）
//伴生对象可以访问伴生类的私有属性
//创建伴生类对象，需要提供特殊的方法，来实现相应的功能
//
object Student{
  //scala中自动识别apply方法，用于创建伴生类对象
  def apply(s:String): Student = new Student(s)
  
  def test(): Unit ={
//    new Student().name
  }
}
