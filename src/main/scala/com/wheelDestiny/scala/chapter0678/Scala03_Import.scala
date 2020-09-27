package com.wheelDestiny.scala.chapter0678

/**
 * import 用于导入类
 *
 * import可以在任意的地方声明使用
 *
 * import可以导入一个包中所有的类，用_
 *  import java.util._
 *
 * import导入相同包中的多个类，采用{}进行包含处理。
 * import java.util.{ArrayList,HashMap,HashSet}
 *
 * import可以采用特殊的方式来隐藏指定的类：{类名=>_}
 *  import java.util.{Date=>_}
 *
 * import可以真正的导包
 *  import java.util
 *
 *  scala可以为导入类的时候给类起别名
 *    import java.util.{HashMap=>JavaHashMap}
 *
 */


import _root_.java.util._



object Scala03_Import {
  def main(args: Array[String]): Unit = {
    val date = new _root_.java.util.Date()
    println(date)

  }

}
