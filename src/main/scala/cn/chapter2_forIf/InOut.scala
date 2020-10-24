package cn.chapter2_forIf

import scala.io.StdIn;

/**
 * 输入输出demo
 */
object InOut {

  def main(args: Array[String]): Unit = {
    //用于读取数据
    val str: String = StdIn.readLine()
    println(s"读取到数据是${str}")
  }
}
