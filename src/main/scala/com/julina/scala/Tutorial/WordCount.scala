package com.julina.scala.Tutorial

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by jmaharjan on 1/5/17.
  */
object WordCount {
  def main(args: Array[String]) : Unit ={
    val conf = new SparkConf().setAppName("wordCount").setMaster("local")
    val sc = new SparkContext(conf)
    val input =  sc.textFile("src/main/scala/input")
    val words = input.flatMap(line => line.split(" "))
    // Transform into word and count.
    val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
    // Save the word count back out to a text file, causing evaluation.
    counts.saveAsTextFile("src/main/scala/output")
  }
}
