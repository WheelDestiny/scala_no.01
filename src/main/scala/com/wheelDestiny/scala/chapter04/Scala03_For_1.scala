package com.wheelDestiny.scala.chapter04

//_的含义是导入一个类中所有的内容，方法，变量等
import scala.util.control.Breaks._

object Scala03_For_1 {

  def main(args: Array[String]): Unit = {
//    for(i <- Range(0,9)){
//      for(j <- Range(9-i-1,0,-1)) {
//        print(" ")
//      }
//      for (j <- Range(0,i*2+1)){
//          print("*")
//        }
//      println()
//    }
//
//    for(i <- Range(1,18,2)){
//      println(" "*(8-(i/2))+"*"*i)
//    }

    //for循环中可以使用一行代码来声明变量，但是也可以用{}来换行声明多个变量
//    for{i <- Range(1,18,2)
//        j = (18-i)/2
//        }{
//      println( " "*j + "*"*i)
//    }

    //循环守卫,即增加了一个条件判断，如果成立则进入循环体，如果不成立，则进行下次循环
    //scala中没有continue关键字

    //默认情况下for循环的返回值为Unit类型
//    val unit = for (i <- 1 to 5 if i % 2 == 0) {
//      //      println(i)
//    }

    //yield关键字的作用是将每一次循环的结果放入一个集合中去
//    val ints = for (i <- 1 to 10) yield i * 2
//    println(ints)

    //嵌套循环
//    for{
//      i <- 1 until 10;
//      j <- 2 until 4
//      }{
//      println(i+"="+j)
//      }

    //中断循环
    //java中的break
    //scala中没有break关键字，但是可以使用面向对象的方式进行中断
    breakable{
      for(i <- 1 to 6){
        if(i == 5){
          break
        }
        println(i)
      }
    }
    println("over")

  }
}

