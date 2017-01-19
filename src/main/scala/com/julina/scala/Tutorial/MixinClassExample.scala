package com.julina.scala.Tutorial

/**
  * Created by jmaharjan on 1/19/17.
  */
abstract class AbstractIterator {
  type T
  def hasNext : Boolean
  def next : T
}

trait RichIterator extends AbstractIterator{
  def foreach(f: T => Unit): Unit ={
    while (hasNext){
      f(next)
    }
  }
}

class StringIterator(s: String) extends AbstractIterator{
  override type T = Char

  private var i = 0
  override def hasNext: Boolean= i < s.length

  override def next: T= {
    val ch = s charAt(i)
    i =i +1
    ch
  }
}

object StringIteratorTest{
  def main(args: Array[String]) {
    class Iter extends StringIterator("This is just character iterator test... ") with RichIterator
    val iter = new Iter
    iter foreach println
  }
}
