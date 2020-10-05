package com.wheelDestiny.scala.chapter10

object Scala08_Method1 {
  def main(args: Array[String]): Unit = {
    //集合中常用的方法
    val list = List(1, 2, 3, 4,2,3,5,7)

    //筛选过滤
//    println(list.filter(i => (i % 2)==0))

    //拉链：ZIP
    val list1 = List(1,2,3,2,3,4,5,5,10)
    //将两个集合数据进行关联，关联后的数据值形成了元组
//    println(list.zip(list1))

    //并集
//    println(list.union(list1))
    //交集
//    println(list.intersect(list1))
    //差集
    println(list1.diff(list))

  }

}
