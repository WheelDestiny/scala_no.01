package com.wheelDestiny.scala.chapter09

import com.wheelDestiny.scala.chapter09.Scala04_Transform3.User4

object Scala04_Transform3 {
  def main(args: Array[String]): Unit = {
    val user4 = new User4
    user4.insert()
    user4.delete()
  }
  class User4 extends Test {
    def insert(): Unit ={

    }
  }
  implicit class Person4(u:User4){
    def delete(): Unit ={
    }
  }

}

trait Test{

}
//隐式转换的搜索范围可以扩展到混入的trait的伴生对象中
object Test{
  implicit class Person4(u:User4){
    def delete(): Unit ={
    }
  }
}






