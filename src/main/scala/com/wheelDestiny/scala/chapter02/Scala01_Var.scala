package com.wheelDestiny.scala.chapter02

object Scala01_Var{
  //在方法外部声明变量使用val关键字，等同于使用final关键字修饰
  val sex : String = "n"
  var bir : String = "0905"
  def main(args: Array[String]): Unit = {
    //声明变量
    //var 变量名 : 变量类型 = 变量赋值
    /*
    * 声明变量必须显示的初始化，
    * */
    var name : String = "name"
    var c : Char = 'c'
    var b : Boolean = true
    var age : Int = 10;
    //使用val声明的变量的值无法修改
    val namea : String = "lisi"


  }

}
