package com.wheelDestiny.scala.chapter0678

/**
 * scala中没有接口的概念
 *
 * 有特质（trait）的概念，类似于接口
 */
object Scala19_ClassInfo {
  def main(args: Array[String]): Unit = {

    //type关键字可以起别名
    type AAA = User19
    var aa = new AAA

    //scala如果想要获取类的信息，需要采用特殊的方法:classof[类型]
    //能直接使用classof的原因是Predef伴生对象是默认导入当前开发环境中的
    //This is a stub method. The actual implementation is filled in by the compiler.
    val value = classOf[User19]

    value.getInterfaces

    val user:Object = new User19

    //判断类型
    val bool = user.isInstanceOf[AAA]
    if(bool){
      //转换类型
      val user1 = user.asInstanceOf[AAA]
    }

  }
}
class User19{

}



