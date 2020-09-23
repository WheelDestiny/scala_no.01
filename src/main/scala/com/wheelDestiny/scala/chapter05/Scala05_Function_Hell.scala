package com.wheelDestiny.scala.chapter05

object Scala05_Function_Hell {
  def main(args: Array[String]): Unit = {
    //函数时编程-地狱

    //scala是完全面向函数式编程语言

    //函数在scala中可以做任何事情
    //函数可以赋值给变量，函数可以作为函数的参数，函数可以作为函数的返回值
    def f(): Unit ={
      println("f")
    }
    def f0()={
      //返回函数
      //直接返回函数是无法识别的，需要增加特殊符号:_
      f _
    }
//    f0()()


    def f1(i : Int) ={
      def f2(j : Int): Int ={
        i*j
      }
      f2 _
    }
//    println(f1(2)(3))

    //函数柯里化
    def f3(i:Int)(k:Int)(j:Int) : Int ={
      i*j*k
    }
//    println(f3(2)(4))

    //闭包
    //一个函数在实现逻辑时，将外部的变量引入函数的内部，改变了这个变量的生命周期，称之为闭包
    def f4(i : Int):(Int)=>Int ={
      def f5(j : Int): Int ={
        i*j
      }
      f5 _
    }
//    f4(10)(2)
    //将函数作为参数传递给另外一个函数，需要采用特殊的声明方式
    //() => Unit
    //(参数列表) => 返回值类型   这其实就是函数这种对象的类型形式
    def f5(f : (Int) => Int): Int ={
      f(2)+10
    }
    def f6(i : Int): Int ={
      i*2
    }
//    println(f5(f6))

    //使用匿名函数来改善代码
    def f7(f : (Int,Int)=>Int,a: Int,b : Int): Int ={
      f(a,b)
    }
//    println(f7((i,j)=>{i+j},2,3))
//    println(f7((i,j)=>i+j,2,3))
    //如果只用一次的参数可以使用_来代替
    println(f7(_+_,2,3))

    def f8(f : (Int)=>Unit): Unit ={
      f(10)
    }
//    def f9(i : Int):Unit ={
//      println(i)
//    }
//    f8((i:Int)=>{println(i+1)})
//    f8((i)=>println(i+1))
//    f8(i=>println(i+1))
//    f8(println(_))
    //如果只有一个参数，那么(_)可以省略
    f8(print)

  }
}