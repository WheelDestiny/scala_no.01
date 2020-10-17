package com.wheelDestiny.scala.chapter12

object Scala05_Match3 {
  def main(args: Array[String]): Unit = {
    //特殊的模式匹配
    val (x,y) = (1,2)
//    println(x+"="+y)

    val (name,age,email) = ("张三",20,"aaa")
//    println(name+" "+age+" "+email)

    //包含了连续两个运算符
    val (q,r) = BigInt(10) /% 3
//    println("q="+q+" r="+r)

    val list = List(1,2,3,4,"abc")

    val ints: List[Int] = list.filter(i => {
      i.isInstanceOf[Int]
    }).map(i => i.asInstanceOf[Int] + 1)

    //偏函数应用
    val addOne1 = new PartialFunction[Any, Int] {
      //判断需要操作的数据
      def isDefinedAt(i: Any) = {
        if (i.isInstanceOf[Int]) {
          true
        } else false
      }
      //对需要操作的数据执行具体的操作
      def apply(i: Any) = i.asInstanceOf[Int]+1
    }
    val addOne2: PartialFunction[Any,Int] = {
          //case语句可以自动转化为偏函数
      case i: Int => i + 1
    }

    //收集方法collect，可以执行偏函数操作(同时会把不满足条件的数据过滤掉)，
    // 相对的，map方法不能执行偏函数操作，必须所有的数据做操作
    val list1 = list.collect(addOne1)
    println(list.collect(addOne2))

    //最终我们可以使用匿名函数来实现偏函数的调用
    val ints1 = list.collect({
          //case出现在{}内可以被称为偏函数
      case i: Int => i + 1
    })
    println(ints1)


  }


}
