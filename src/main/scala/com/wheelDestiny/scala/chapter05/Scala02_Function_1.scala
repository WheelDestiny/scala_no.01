package com.wheelDestiny.scala.chapter05

object Scala02_Function_1 {
  def main(args: Array[String]): Unit = {
    //函数：入参(方法参数),出参(返回值)

    //无参，无返回值
    def test():Unit = {
      println("Test")
    }
//    test()

    //有参，有返回值
    //scala中函数没有重载概念
    //如果在同一个作用域中，函数不能同名
    def test1(s : String) : Unit = {
      println(s)
    }
//    test1("lisi")

    //有参，有返回值
    def test2(s : String): String = {
      return s
    }

//    println(test2("zhao"))

    //无参，有返回值
    def test3(): String ={
      return "qian"
    }
//    println(test3())

    //scala中没有throws关键字，所以如果有异常发生，也不需要在函数声明时抛出异常



  }

}
