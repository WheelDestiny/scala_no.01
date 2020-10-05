package com.wheelDestiny.scala.chapter10



object Scala07_Method {
  def main(args: Array[String]): Unit = {
    //集合中常用的方法
    val list = List(1, 2, 3, 4,2,3,5)

    //获取集合的前n个
//    list.take(2)

    //转换
//    println(list.map(i => (i, 1)).groupBy(x=>x._1).map(i=>(i._1,i._2.size)))
    //迭代器
//    list.iterator

    //分组
//    println(list.groupBy(i => i%2))
    val list1 = List("11", "14", "22", "23", "31")

    val stringToStrings = list1.groupBy(i => {
      i.substring(0, 1)
    })
    println(stringToStrings)

    //按照指定的规则排序,固定升序
//    println(list.sortBy((i) => {
//      i
//    }))
//    println(list1.sortBy((i) => {
//      i.substring(1)
//    }))

    //排序,自定义升降序
//    println(list.sortWith((l, r) => {
//      l > r
//    }))
//    println(list1.sortWith((l, r) => {
//      if (l.substring(1).compareTo(r.substring(1)) >= 0) {
//        true
//      } else {
//        false
//      }
//    }))

//    list.fold()
    //求和
//    println(list.sum)
    //    list.max
    //    list.min
    //乘积
//    println(list.product)
//    list.distinct
    //翻转(无排序)
//    println(list.reverse)

    //wordCount
    val list2 = List("Hello", "Hello", "Hello", "World", "Scala", "Scala", "Scala", "Scala","Java","Java","Java","Java","Java","Java")

//    println(list2.groupBy(i => i).map(i => (i._1, i._2.size)).toList.sortWith((l, r) => l._2 > r._2).take(3))

    //扁平化操作
    //将整体拆分成一个一个的个体
    val list3 = List("Who is the Prisoner of Azkaban", "A person who is learning Azkaban", "it's me")
    //list => 1,2,3
    val list4 = list3.flatMap(i => i.split(" "))

    println(list4)
    println(list4.groupBy(i => i).map(i => (i._1, i._2.size)).toList.sortWith((l, r) => l._2 > r._2))


//    list.reduce()

//    list.filter()

  }

}
