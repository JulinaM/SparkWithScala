package com.julina.scala.Tutorial

/**
  * Created by jmaharjan on 2/6/17.
  */
class Rational(n: Int, d: Int) // primary constructor --> constructor of super class can be called ONLY from primary constructor
{
  println("Debug : Initializing new Object.")

  require(d != 0)

  val num : Int = n
  val den : Int = d

  val divisor : Int = gcd(num.abs , den.abs)
  def this(n: Int) = this(n, 1) //auxiliary constructor and it must call another constructor on its first action

  override def toString: String = n +"/"+ d

  def add(rationalObj : Rational) : Rational ={
    new Rational(num * rationalObj.den + rationalObj.num * den, den * rationalObj.den)
  }

  def gcd(a: Int, b: Int) : Int = if(b==0) a else gcd(b, a % b)
}

object Entry extends App{
  val rational1 : Rational = new Rational(5, 3)
  val rational2 : Rational = new Rational(2, 2)
  val rational3 = rational1.add(rational2)

  println(rational3.toString)
}

class Companion{
  val name = "Julina"
}
object Companion{
  val crn = 54
}

object Entry1 extends  App{
  println(Companion.crn)
}
