package com.wheelDestiny.scala.chapter02

object Scala01_Var_1{
  def main(args: Array[String]): Unit = {
    //scala为了能让开发过程变得简单，可以自动推断出来的内容都可以省略
    val username : String = "zhangsan"
    val name = "aaa"
    val wang = "wang"
    val dog = new Dog
    dog.name = "aaaa"
    println(dog.name)
  }

}
class Dog{
  var name : String = ""
}