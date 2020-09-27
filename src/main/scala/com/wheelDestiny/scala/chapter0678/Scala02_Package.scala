package com.wheelDestiny.scala.chapter0678

/**
 * 面向对象
 *
 * Scala中包的声明方式和java是一致的。但是有其他的使用方式
 *
 */
//1,在同一个源码文件中可以多次声明，每次声明都是上一个包的子包，声明的类属于最后一个包
//  源码中的类所在的位置不需要和包路径相同
//2，scala中所有的语法都可以进行嵌套
//  package可以使用小括号，在小括号外声明的类不属于这个包
//3，scala中可以声明父包和子包，父包中的类，子包可以直接访问，不需要引入，但是子包中的类，父包需要引入才能访问
//4，package中可以声明类，但是不能声明变量和函数
//5，scala为了弥补包的不足，使用了包对象的概念，即包也是一个对象,在包对象中可以声明属性和方法
package test {

  import com.wheelDestiny.scala.chapter0678.test.test1.Emp

  object Scala02_Package {
    def main(args: Array[String]): Unit = {
      val e = new Emp
    }
  }

  class Emp1{

  }

  package object test{
    val test = "123"
    def a = "11"

  }

  package test1 {
    class Emp{

    }
    object Scala02_Package {
      def main(args: Array[String]): Unit = {
        val e = new Emp1
      }
    }
  }
}



