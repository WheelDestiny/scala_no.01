package com.wheelDestiny.scala.chapter0678

/**
 * 构造方法的参数
 *
 */
object Scala12_class2 {
  def main(args: Array[String]): Unit = {
    var user = new User12("aa")

    println(user.s)


  }
}
//主构造方法中的参数的作用域在整个类体中都适用，
// 但是如果想要参数作为属性来使用，可以采用特殊的方式来声明,
// 即在参数前添加关键字var或val

class User12(var s: String){

}
