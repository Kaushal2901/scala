package main.General

/**
  * Created by ksultania on 5/16/2018.
  */
object MergeSortedArray {


  def main(args: Array[String]): Unit = {
    val arr1 = Array(1,5)
    val arr2 = Array(1,4)
    val mergedArray = merge(arr1, arr2)
    for(a <- mergedArray)
      println(a)
  }

  def merge(array1: Array[Int], array2: Array[Int]): Array[Int] = {

    var a1 = 0
    var a2 = 0

    val array1Length = array1.length
    val array2Length = array2.length
    var mergedArray = new Array[Int](array1Length + array2Length)

    while (a1 < array1Length && a2 < array2Length) {
      if (array1(a1) < array2(a2) || a2 == array2Length) {
        mergedArray(a1 + a2) = array1(a1)
        a1 += 1
      }else {
        mergedArray(a1 + a2) = array2(a2)
        a2 += 1
      }
    }

    mergedArray
  }
}

