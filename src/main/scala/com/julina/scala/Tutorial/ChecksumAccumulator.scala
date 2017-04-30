package com.julina.scala.Tutorial

/**
  * Created by julina on 2/5/17.
  */

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private var cache = Map[String, Int]()
  def calculate(s: String) : Int = {
    if (cache.contains(s)) {
      cache(s)
    }
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }




//Singleton
class Companion{
  var firstName = "Julina"

  def getFirstName(): String = firstName
}

object Companion{
  var companionInstance = new Companion
  val lastName = "Maharjan"

  def getFullName () : String = companionInstance.getFirstName() + " "+ lastName
}

  def main(args: Array[String]): Unit = {
    val output = ChecksumAccumulator.calculate("This is Companion class and object Demo")
    println(output)

    println ("--------------- Companion Class & Object ---------------")
    println(Companion.getFullName())

  }
}
