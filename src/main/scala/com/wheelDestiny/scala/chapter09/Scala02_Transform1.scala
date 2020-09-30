package com.wheelDestiny.scala.chapter09

object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {

    implicit  def tramsform(mysql: Mysql):Operate = {
      new Operate
    }

    val mysql = new Mysql
    mysql.select()
    mysql.delete()

  }
}

class Operate{
  def delete(): Unit ={

  }
}

class Mysql{
  def select(): Unit ={

  }
}
