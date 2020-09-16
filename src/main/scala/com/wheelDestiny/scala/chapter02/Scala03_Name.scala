package com.wheelDestiny.scala.chapter02

//标识符
object Scala03_Name {
  def main(args: Array[String]): Unit = {
    //scala可以使用特殊符号作为标识符，其实是将特殊符号在编译时进行了转换，
    val +--- = "123"
    //scala中下划线_有特殊的用途，不能独立当做变量名来使用
    val _ = "aaa"
    val aa ="aaa"+_
    val int = 123
    val `private` = "111"

    println(int)


  }

}
