package com.wheelDestiny.scala.chapter10


object Scala11_Reduce {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)
    val list1 = List("1", "2", "3", "4")
    //规约
//    println(list.reduce((i, j) => j - i))
//    println(list.reduce(_ - _))
//    println(list.reduceLeft(_ - _))
    println(list.reduce((i, j) =>{
      if(i-j>0){
        j
      }else{
        i
      }
    }))

    //原理   reduceRight = reversed.reduceLeft[B]((x, y) => op(y, x))
//    println(list.reduceRight(_ - _))

    println(list1.reduce((i, j) => j + i))

  }

}
