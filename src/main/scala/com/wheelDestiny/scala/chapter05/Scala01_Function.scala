package com.wheelDestiny.scala.chapter05

object Scala01_Function {
  def main(args: Array[String]): Unit = {
    //函数式编程

    //编程的范式，

    //面向对象：解决问题时，将问题拆解为多个小问题(形成了对象)，分别解决
    //  对象关系：继承，实现，重写，多态

    //函数式编程关心的是问题解决的方案(封装功能)：重点在于函数(功能)，函数的入参，出参

    //函数式编程重点在于函数

    //java中的方法和scala中的函数都可以进行功能的封装，但是方法必须和类型绑定，但是函数不需要

    //声明函数
    //scala中在任意语法环境中可以声明其他语法规则
    //关键字 方法名(参数名 : 参数类型) : 返回值类型
    def test(s : String ) : Unit = {
      //函数体
      print(s)
    }

    //调用函数
    test("zhaosi")

  }

}
