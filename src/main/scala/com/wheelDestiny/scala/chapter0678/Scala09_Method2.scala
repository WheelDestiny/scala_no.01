package com.wheelDestiny.scala.chapter0678

/**
 * 构造方法
 */
object Scala09_Method2 {
  def main(args: Array[String]): Unit = {
    //创建对象
    val user = new User09("aa","bb")
    println(user)


  }
}
//scala中构造方法分为两类：主构造方法&辅助构造方法
//scala构建对象可以通过辅助构造方法类创建，凡是必须调用主构造方法
//scala是完全面向函数的语言，所以类也是函数
//类既然是函数，那么类名之后可以使用()作为参数列表
//类锁代表的函数其实就是这个类的构造方法
//默认情况下，scala也是给类提供无参的构造方法，所以()可以省略
//在类的后面声明的构造方法就是主构造方法
//在主构造方法中声明的构造方法就是辅助构造方法
class User09(s : String ){
  //类体&构造方法体
  println("主构造方法")
  println(s)
  def this(s:String,ss:String){
    this(s)
    println("辅助构造方法2")
  }
  //声明辅助构造方法，方法名为this
  //！！构造方法调用其他的构造方法时，应该保证被调用的构造方法已经被声明过
  def this(){
    //辅助构造方法1
    this("辅助构造方法1","a")
//    println("辅助构造方法1")
  }

}

