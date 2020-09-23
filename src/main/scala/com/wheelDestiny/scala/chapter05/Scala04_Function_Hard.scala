package com.wheelDestiny.scala.chapter05

object Scala04_Function_Hard {
  def main(args: Array[String]): Unit = {
    //函数式编程-扩展
    //可变参数
    def test(name : String*): Unit ={
      println(name)
    }
    //调用函数时，可传多个参数，也可以不传参数
//    test("zhao","qian","sun")
//    test()

    // 默认参数
    def test1(name : String ,age : Int = 20 ): Unit ={
      println(name+"-"+age)
    }
    //如果希望函数中的某个参数使用默认值，那么可以在声明时直接赋初始值
//    test1("li")
//    test1("zhou",30)

    def test2(name2 : String = "wu",name1 : String ): Unit ={
      println(name1+"-"+name2)
    }
    //参数匹配规则为从前到后，从左到右
//    test2("zheng","wang")

    //带名参数，可以选择需要传递的参数是哪个
    test2(name1 = "feng")

  }
}