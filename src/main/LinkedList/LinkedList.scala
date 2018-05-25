
package main

import scala.annotation.tailrec

/**
  * Created by ksultania on 4/8/2018.
  */

case class Node(value: Int, next: Option[Node])

object LinkedList {


  def main(args: Array[String]): Unit = {
    var head = Node(2, None)
    var addedlist = addElements(head, 3)
    println(addedlist)

    var deletedlist = deleleElement(addedlist, 1)
    println(deletedlist)
  }

  /** reverse a link list recursively
    *
    * @param node
    * @param prev
    * @return
    */
  @tailrec
  def reverseList(node: Node, prev: Option[Node] = None): Node = {
    val reversedList = node.copy(next = prev)
    node.next match {
      case None => reversedList
      case Some(next) => reverseList(next, Option(reversedList))
    }
  }


  /** add elements to linked list
    *
    * @param head
    * @param element
    * @return
    */
  @tailrec
  def addElements(head: Node, element: Int): Node = {

    head match {
      case null => {
        Node(element, None)
      }
      case _ => {
        head.next match {
          case None => var newNode = Node(element, None)
            head.copy(next = Option(newNode))
          case Some(next) => addElements(next, element)
        }
      }
    }
  }


  def deleleElement(head: Node, element: Int): Unit = {

    val test: List[Int] = List(1,2,3)
    val newtest= test.drop(1)
    println(newtest)

    /*var current = head
    current match {
      case null => current
      case node =>
        node.next match {
          case None => if (node.value == element) node = null
          case Some(node1) => deleleElement(node1, element)
        }
    }*/
  }

}
