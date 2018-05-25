package main

import scala.annotation.tailrec

/**
  * Created by ksultania on 5/15/2018.
class GeneralTree[A] {

 case class Node(val data: A, val children: Seq[Node])

  def preOrder(visit: A => Unit, n: Node): Unit = {
    def recur(n: Node): Unit ={
      visit(n.data)
      for(c <- n.children) recur(c)
    }
    recur(n)
  }


  def postOrder(visit : A => Unit, n:Node): Unit = {
    def recur(n:Node): Unit = {
    for(c <- n.children) recur(c)
      visit(n.data)
    }
    recur(n)
  }

  def height(n:Node): Int = {
    1+ n.children.foldLeft(-1)((h,c) => h max(height(c)))
  }

  def size(n:Node): Int = {
    1+ n.children.foldLeft(0)((s,c) => s+size(c))
  }

}
*/
