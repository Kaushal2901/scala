package main.Recursion

import scala.annotation.tailrec

/**
  * Created by ksultania on 4/7/2018.
  */
object Recursion {


  def main(args: Array[String]): Unit = {
    val sum = sumAccumulator(List(1, 2, 3, 4, 5, 5), 0)
    println(" recursive sum calculated : " + sum)

    val product = productAccumulator(List(1, 2, 3), 1)
    println(" recursive product calculated : " + product)

    val max = maxAccumulator(List(1, 7, 3), 0)
    println(" recursive max calculated : " + max)


    val factorial = factorialWithAccum(5, 1)
    println(" recursive factorial calculated : " + factorial)

    val fibonacci = fibonacciWithAccum(1, 2, List(1, 2), 5)
    println("recursive fibonacci list: " + fibonacci)
  }

  /** recursive function to return sum of elements in a list
    *
    * @param intList
    * @param sumAccum
    * @return
    */
  @tailrec
  def sumAccumulator(intList: List[Int], sumAccum: Int): Int = {
    intList match {
      case Nil => sumAccum
      case x :: tail => sumAccumulator(tail, (sumAccum + x))
    }
  }


  /** recursive function to return product of elements in a list
    *
    * @param intList
    * @param productAccum
    * @return
    */
  @tailrec
  def productAccumulator(intList: List[Int], productAccum: Int): Int = {
    intList match {
      case Nil => productAccum
      case x :: tail => productAccumulator(tail, (productAccum * x))
    }
  }


  /** recursive function to return maximum elements in a list
    *
    * @param intList
    * @param maxAccum
    * @return
    */
  @tailrec
  def maxAccumulator(intList: List[Int], maxAccum: Int): Int = {
    intList match {
      case Nil => maxAccum
      case x :: tail =>
        val tempMax = if (x > maxAccum) x else maxAccum
        maxAccumulator(tail, tempMax)
    }
  }


  def factorial(num: Int): Int = {
    if (num == 0)
      return 1
    else
      return (num * factorial(num - 1))
  }


  /** recursive function to return factorial of a given number
    *
    * @param n
    * @param accum
    * @return
    */
  @tailrec
  def factorialWithAccum(n: Int, accum: Int): Int = {
    if (n == 0) accum
    else factorialWithAccum(n - 1, n * accum)
  }

  /** recursive function to find fibonacci till n
    *
    * @param a
    * @param b
    * @param theList
    * @param n
    */
  @tailrec
  def fibonacciWithAccum(a: Int, b: Int, theList: List[Int], n: Int): List[Int] = {
    if (n == 0) theList
    else {
      val sum = a + b
      val list: List[Int] = theList ::: List(sum)
      fibonacciWithAccum(b, sum, list, n - 1)
    }
  }


}
