package main.graph

import scala.collection.mutable.HashMap
import scala.collection.mutable.HashSet
import scala.collection.mutable.LinkedList

/**
  * Created by ksultania on 5/17/2018.
  */
object Graph {

  private val nodeLookup: HashMap[Int, Node] = HashMap[Int, Node]()

  case class Node(
                   id: Int,
                   adjacent: LinkedList[Node]
                 )


  private def getNode(id: Int): Node = {
    nodeLookup(id)
  }

  private def addEdge(source: Int, destinatation: Int): Unit = {

  }

  def hasPathDFS(source: Int, destinatation: Int): Boolean = {
    val s = getNode(source)
    val d = getNode(destinatation)
    val visited: HashSet[Integer] = HashSet[Integer]()
    return hasPathDFS(s, d, visited)
  }

  /**
    * DFS code to find path between two given nodes
    *
    * @param source
    * @param destinatation
    * @param visited
    * @return
    */
  def hasPathDFS(source: Node, destinatation: Node, visited: HashSet[Integer]): Boolean = {

    if (visited.contains(source.id))
      false

    visited.add(source.id)
    if (source == destinatation)
      true

    for (child <- source.adjacent) {
      if (hasPathDFS(child, destinatation, visited))
        true
    }
    false
  }

  def hasPathBFS(source: Node, destination: Node): Boolean = {

    var nextToVisit: LinkedList[Node] = LinkedList[Node]()
    val visited: HashSet[Integer] = HashSet[Integer]()
    nextToVisit :+ source
    while (!nextToVisit.isEmpty) {
      val node = nextToVisit.head
      nextToVisit = nextToVisit.tail
      if (node == destination)
        true
      visited.add(source.id)
      for (child <- node.adjacent) {
        nextToVisit :+ child
      }
    }
    false
  }


}
