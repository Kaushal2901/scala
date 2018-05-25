package main.Array

/**
  * Created by ksultania on 5/16/2018.
  */
trait Stack[A] {

  def push(a: A): Unit

  def pop(): A

  def peek: A

  def isEmpty: Boolean
}
