package com.wheelDestiny.scala.chapter12

object Scala02_Match {
  def main(args: Array[String]): Unit = {
    val oper = '2'
    val n1 = 10
    val n2 = 20
    var res = 0;
    //模式匹配 只要能匹配上就会执行case，并且略过之后所有的case
    oper match{
      case '+' => res = n1+n2
      case '-' => res = n1-n2
      case '*' => res = n1*n2
      case '/' => res = n1/n2
      case i => println(i+"!!")
      //其他情况,如果全都匹配不到，并且不写case _ 会报错
      case _ if oper.equals('2') =>println("error1111")
      case _ =>println("error")
    }
    println(res)




  }


}
