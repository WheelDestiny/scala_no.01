package com.wheelDestiny.scala.chapter0678

/**
 * scala中没有接口的概念
 *
 * 有特质（trait）的概念，类似于接口
 */
object Scala18_interface5 {
  def main(args: Array[String]): Unit = {
    val db = new Mysql18

    db.getMessage


  }
}

//trait可以继承类
trait Operate18{
  //特质使用的范围
  this:Exception =>
  def insert(){
    println("insert Operate")
    this.getMessage
  }
}

class Mysql18 extends Exception with Operate18 {

}


