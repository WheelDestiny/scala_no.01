package com.wheelDestiny.scala.chapter12

object Scala01_Match {
  def main(args: Array[String]): Unit = {
    val oper = '*'
    val n1 = 10
    val n2 = 20
    var res = 0;
    //模式匹配
    oper match{
        //每个case之后不需要加break，匹配到之后后续的语句不会执行
      case '+' => res = n1+n2
      case '-' => res = n1-n2
      case '*' => res = n1*n2
      case '/' => res = n1/n2
      //其他情况,如果全都匹配不到，并且不写case _ 会报错
      case _ =>println("error")
    }
//    println(res)


    val list = List(List(1, 2), List(3, 4))
//    println(list.flatMap(i => i))
    println(list.flatMap(_.toList))
    //这样直接使用下划线会导致语法混淆，所以不可以这样使用
//    println(list.flatMap(_))



  }


}
