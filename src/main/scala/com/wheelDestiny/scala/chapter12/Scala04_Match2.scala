package com.wheelDestiny.scala.chapter12

object Scala04_Match2 {
  def main(args: Array[String]): Unit = {

//    for(arr <- Array(Array(0),Array(1,0))){
//      val result = arr match{
//        case Array(0) => "0"
//        case Array(i,j) => i+j
//        case Array(0,_*) => "以0开头的数组"
//      }
//      println(result)
//    }
//
//    for(arr <- Array(List(0,1,2),List(2,4))){
//      val result = arr match{
//        case 0 :: tail => "aa"
//        case _ => "bb"
//      }
//      println(result)
//    }

    class Square{

    }
    //对象匹配
    object Square{
      def apply(): Square = new Square()
      def unapply(s: Square): Option[Square] = Some(s)
    }
    val num = None
    //模式匹配
    num match {
      case Square(n) => println(n)
      case _ => println("None")
    }
  }


}
