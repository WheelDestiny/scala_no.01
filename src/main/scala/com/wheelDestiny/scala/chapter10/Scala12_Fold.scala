package com.wheelDestiny.scala.chapter10
object Scala12_Fold {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    val t = 100
    //折叠，可以对集合数据进行简化，将多条数据转化为一条
    //fold的第一个参数是集合之外的数据
    //第二个参数是数据要进行的处理

    println((t /: list) (_-_))
    println(list.foldLeft(t)(_-_))

    println((list :\ t) (_-_))
    println(list.foldRight(t)(_-_))
    //将每个步骤记录下来从右到左
    println(list.scanRight(t)(_ - _))





  }

}
