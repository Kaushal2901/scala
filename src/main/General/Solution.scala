/*
package main

/**
  * Created by ksultania on 5/3/2018.
  */
class Solution(val x: Int) {
  val y: Int = x
}

object Solution1 {

  def main (args: Array[String] ): Unit = {
  print ("test")

    val command = Array("GGGGR")
    val output= doesCircleExist(command)
    println(output(0), output(1))
}
/*
  def triangleOrNot(a: Array[Int], b: Array[Int], c: Array[Int]): Array[String] = {
    var i=0
    val outputArray: Array[String] = new Array[String](a.size)
    for( i <- (0 to a.size-1) ){
      outputArray(i)= if( (a(i) + b(i) > c(i) ) || (a(i) + c(i) > b(i) ) || (b(i) + c(i) > a(i) )) "Yes" else "No"
    }
    outputArray
  }*/

  def doesCircleExist(commands: Array[String]): Array[String] = {
    var i=0
    var x=0
    var y=0
    var dir=0
    var j=0
    var outputArray = new Array[String](commands.size)
    for (word <- commands){
      while(true){
      for(i <- (0 to word.length-1)){
        var move = word(i)
        if(word.length == 1){
          if (move == 'L' || move == 'R') {
            x= 0
            y =0
          }
          else {
            x=1
          }
        }else{
          if(move == "R"){
            dir = (dir + 1)%4
          }
          else if (move == "L"){
            dir = (4 + dir - 1) % 4
          }
          else
          {
            if (dir == 0)
              y=y+1
            else if (dir == 1)
              x=x+1
            else if (dir == 2)
              y=y-1
            else // dir == 3
              x=x-1
          }
        }

        if(x==0 && y==0){
          println("for j ="+j)
          outputArray(j) = "YES"
        }
        else
          outputArray(j) = "NO"
      }
      j=j+1
    }

    outputArray
  }



}*/
