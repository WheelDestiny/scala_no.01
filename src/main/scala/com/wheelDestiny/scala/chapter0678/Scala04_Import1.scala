package com.wheelDestiny.scala.chapter0678

/**
 *  scala中如果想要从最开始的包中查找类，需要增加绝对路径，使用_root_开头
 */

import _root_.java.util._

package java{
  package util{
    class HashMap{

    }
    object Scala04_Import1 {
      def main(args: Array[String]): Unit = {
        val map = new HashMap

        println(map)

      }
    }
  }
}


