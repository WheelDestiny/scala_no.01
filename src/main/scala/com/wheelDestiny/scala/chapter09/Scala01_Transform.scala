package com.wheelDestiny.scala.chapter09

object Scala01_Transform {
  def main(args: Array[String]): Unit = {
    //自动转换-隐式转换
    //scala默认的情况下支持数值类型的自动转换
    //byte->short->int->long
    //scala默认的情况下支出多态语法中的类型转换
    //child->parent->trait

    //scala也允许开发人员自定义类型转换规则
    //将两个无关的类型通过编程手段让他们可以自动转换

    implicit def transform(d:Double)={
      d.toInt
    }
    //相同的作用域内，不能有两个相同转换类型的转换规则

    val i :Int = 5.0

    println(i)



  }

}
