package com.julina.scala.Tutorial

/**
  * Created by julina on 2/5/17.
  */
object Literals extends App{

  println(
    """|I am trying to get this literals thing.
      |Well I thing "" has got something to do.
      |What about /" and /u0022 ??
      |Oh Yeah!! """.stripMargin)

  val s = 'add
  println(
    """
      |
    """.stripMargin)
  print(s)
  println(doSth(s, 5, 2))


  def doSth (s: Symbol , value: Int, value2: Int):String = {
    ":: "+ value + " "+ s.name +" "+ value2 +" = " + add(value, value2)
  }

  def add(a: Int, b: Int): Int = a+b
  def subtract(a: Int, b: Int): Int = a-b
}
