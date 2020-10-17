package com.wheelDestiny.scala.chapter12

object Scala03_Match1 {
  def main(args: Array[String]): Unit = {

    val a = 8
    val obj = if(a == 1) 1
    else if(a ==2) "2"
    else if(a ==3) BigInt(3)
    else if(a ==4) Map{("2",1)}
    else if(a ==5) Map{(1,"2")}
    else if(a ==6) Array(1,2,3)
    else if(a ==7) Array("aa",1)
    else if(a ==8) Array("aa")

    val res = obj match{
      case a : Int => a
        //引用类型的泛型是无法识别的，java中的泛型是通过泛型擦除来实现的，只在编译器中有约束，在字节码中并没有真正的泛型类型
      case b : Map[String,Int] => "Map String-Int"
      case c : Map[Int,String] => "Map Int-String"
        //数组的泛型可以识别，因为数组类型在java中并不是通过泛型来实现的
      case d : Array[String] => "Array String"
      case e : Array[Int] => "Array Int"
      case f : BigInt => "BigInt"
      case _  => "nothing"
    }
    println(res)

  }


}
