/*
/**
  * Created by ksultania on 5/16/2018.
  */
class ArrayStack[A] extends main.Array.Stack[A] {

  private var data = new Array[A](10)
  private var top = -1

  override def push(a: A): Unit = {
    data(top + 1) = a
    top += 1
  }

  override def pop(): A = {
    top -= 1
    data(top + 1)
  }

  override def peek = data(top)

  override def isEmpty = top == -1

}
*/
