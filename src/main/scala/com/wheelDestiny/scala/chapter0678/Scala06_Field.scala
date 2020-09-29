package com.wheelDestiny.scala.chapter0678

import scala.beans.BeanProperty

/**
 *类的属性
 */


object Scala06_Field {
  def main(args: Array[String]): Unit = {
    val user = new User06
    user.username="aaaa"
    println(user.username)

    user.setAge(1)
    user.getAddress
    user.setAddress("")

    println(user.getAge())

    println(user.email)

  }

}

//1，public      默认的访问权限，不需要添加关键字，也没有关键字
//2,protected    访问权限只能是子类访问，和包没有关系
//3,private      私有访问权限，只能当前类访问
//4,private[包名] 包访问权限需要采用特殊的语法规则

package p1{
  package p2{
    class UserP2{
      var name = "zhao"
      private var pw ="1111"
      protected var em = "email"
      private[p2] var add = "aaa"
    }

  }
  package p3{

    import com.wheelDestiny.scala.chapter0678.p1.p2.UserP2

    class EmpP3 extends UserP2 {
      def test(): Unit ={
        val user = new UserP2
//        user.name
//        user.em
      }

    }

  }

}

class User06{
  //声明属性
  //scala中给类声明属性，默认为私有，但是提供了公共的setter方法和getter方法
  var username : String = _

  //如果给属性增加private修饰符，在底层中自动生成的getter和setter方法都是私有的
  private var age :Int = _

  //如果声明的属性用val修饰，那么底层中只会生成getter方法，不会生成getter方法
  val email :String ="11"

  //为了和java bean规范统一，scala提供了注解，生成java中对应的set，get方法
  @BeanProperty var address :String =_

  def getAge ()={
    age
  }
  def setAge (a:Int) = {
    age = a
  }

}