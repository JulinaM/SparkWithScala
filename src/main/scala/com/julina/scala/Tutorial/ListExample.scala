package com.julina.scala.Tutorial

import scala.collection.mutable.ListBuffer

/**
  * Created by jmaharjan on 1/25/17.
  */
object ListExample {
  def main(args: Array[String]): Unit = {

    val list1 = List("0", "1", "2")
    val list2 = List("3", "4", "5")
    println("list1 --->" + list1)
    println("list2 --->" + list2)

    val finalList: List[String] = list1 ::: list2
    //buttom line -> array are mutable and list are immutable in scala ; whereas list are mutable in java
    // here concatenating two lists will result new list exactly like in "String"

    println("finalList ---> " + finalList.toString())

    val list3 = "1"::list2
    // if the operation ends with colon ":", the operation is called on the right operand; (This is called prepending operation)
    // Here, cons operation is called in list2 object
    println("list3 --->" + list3)

    val list4 = "1"::"2"::"3"::Nil // one way of initializing list
    println("list4 --->" + list4)

    //appending in a list
    list1:+"1" // this is rarely used since time taken to append list grows linearly with the size of elements appended; whereas prepending takes constant time
    //sol to this is listBuffer (which is mutable) and to call append operation and when ur done call toList

    val listBuffer = new ListBuffer[String]
    listBuffer:+"1"
    listBuffer:+"2"
    println(listBuffer.toList)
    println("3"::listBuffer.toList)
    println(listBuffer.toList:+"4")

    val list5 = "1":: List[String]()
    list5.count(value=> value.length == 1)
    println(list5)
  }
}
