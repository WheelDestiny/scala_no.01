package com.wheelDestiny.scala.chapter0678

/**
 * scala中没有接口的概念
 *
 * 有特质（trait）的概念，类似于接口
 *
 */
object Scala16_interface3 {
  def main(args: Array[String]): Unit = {
    val db = new Mysql
    db.insert()

  }
}

//特质和父类没有关系，只和当前混入的类有关系，所以在调用时，父类先执行，trait再执行，最后执行当前类
//如果父类和子类混入了相同的trait，那么trait代码只会执行一遍

trait Operate{
  println("operate...")
  def insert(): Unit ={
    println("insert Operate")
  }
}
trait Operate1 {
  println("operate1...")
  def insert(): Unit ={
    println("insert Operate1")
  }
}

trait DB extends Operate {
  println("DB...")
  override def insert(): Unit ={
    println("insert DB")
    super.insert
  }
}

trait File extends Operate with Operate1 {
  println("File...")
  override def insert(): Unit = {
    println("insert File")
    super[Operate1].insert
  }
}

//多trait混入时，代码执行顺序在从左到右，如果混入的特质有父特质，会优先执行父特质
//              方法的调用顺序在从右往左
//trait中super关键字不是指代父trait，而是指代上一级(上一个)trait，即在下方代码中File的super是DB
//如果希望super指向父trait，需要增加特殊操作
//如果混入的多个trait不可以有方法名和参数相同的方法

class Mysql extends DB with File {

}


