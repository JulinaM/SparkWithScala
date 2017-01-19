package com.julina.scala.Tutorial

/**
  * Created by jmaharjan on 1/19/17.
  */
trait TraitExample {
  def isSimilar(a: Any) : Boolean
  def isNotSimilar(a: Any) : Boolean = !isSimilar(a)
}

class Point(xc: Int, yc: Int) extends TraitExample{
  var x: Int = xc
  var y: Int = yc
  override def isSimilar(obj: Any): Boolean = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x

}

object TraitMain extends App{
  var first: Point = new Point(1,1)
  var second: Point = new Point(5,10)
  var third: Point                                                                                                                              = new Point(1,10)
  println(first.isSimilar(second))
  println(first.isSimilar(third))
  println(second.isNotSimilar(third))
}
