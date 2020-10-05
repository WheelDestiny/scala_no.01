package com.wheelDestiny.scala.chapter10

import scala.io.Source

object Scala10_WordCountFile {
  def main(args: Array[String]): Unit = {
    //从文件中获取数据，统计数量
    val lines = Source.fromFile("in/hello.txt").getLines().toList

    lines.foreach(println)


  }

}
