package com.julina.scala.Tutorial

import scala.collection.immutable.HashSet


/**
  * Created by jmaharjan on 1/26/17.
  */
object SetsAndMapsExample {
  def main(args: Array[String]): Unit = {
    //Scala has both mutable and immutable collections
    //By default it is always immutable
    var immutableSet = Set[String]("Boeing", "Airbus")
    immutableSet += "Lear"
    immutableSet.foreach(value => println("immuatable Set: "+ value))

    println()
    import scala.collection.mutable
    var mutableSet = new mutable.HashSet[String]()
    mutableSet+= "Apple"
    mutableSet.+=("Ball")
    mutableSet.foreach(value => println("mutable Set: "+ value))

    println()
    var immutableHashSet = HashSet[String]("J", "A", "M", "E")
    println(immutableHashSet + "S")

    println()
    var mutableMap = mutable.Map[Int, String] ()
    mutableMap += (1 -> "First")
    mutableMap += (2 -> "Second")
    println(mutableMap(1))
    mutableMap.foreach(entry => println(entry))


    println()
    var immmutableMap = Map(1->"Keep your ball within your court", 2 ->"It's always your decision")
    //creating new map using factory method where by 2 tuples sized of 2 is passed as argument
    immmutableMap.foreach(f => println(f))
    for (elem <- immmutableMap) {
      println(elem._1)
    }
    immmutableMap = Map (1-> "What the hell")
    immmutableMap += (3 -> "Bullshit")
    immmutableMap.foreach(println)

  }

}
