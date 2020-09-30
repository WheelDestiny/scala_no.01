package com.wheelDestiny.scala.chapter0678

/**
 * scala中没有接口的概念
 *
 * 有特质（trait）的概念，类似于接口
 */
object Scala17_interface4 {
  def main(args: Array[String]): Unit = {
    val db = new Mysql17

    //动态混入
    val db1 = new Mysql17 with Operate17
    db1.insert()

  }
}

trait Operate17{
  println("operate...")
  def insert(): Unit ={
    println("insert Operate")
  }
}

class Mysql17 {

}


