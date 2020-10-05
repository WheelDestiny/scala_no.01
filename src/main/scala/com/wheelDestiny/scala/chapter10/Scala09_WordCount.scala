package com.wheelDestiny.scala.chapter10

object Scala09_WordCount {
  def main(args: Array[String]): Unit = {
    val list = List(("Who is the Prisoner of Azkaban?", 4), ("A person who is learning Azkaban", 3), ("it's me", 2))

    val tuples = list.flatMap(i => i._1.split(" ")
      .map(j => (j, i._2))).groupBy(i=>i._1)
      .map(i=>(i._1,i._2.map(i=>i._2).sum))
      .toList.sortWith((i,j)=> i._2>j._2 )

    val tuples1 = list.flatMap(i => i._1.split(" ")
      .map(j => (j, i._2))).groupBy(i=>i._1).mapValues(i=>i.map(i=>i._2).sum)

    println(tuples1)

  }

}
