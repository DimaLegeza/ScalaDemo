package week4

/**
 * @author: Dima Legeza
 * @since: 24.06.14
 */
class Cons[T] (val head: T, val tail: List[T]) extends List[T] {

  override def isEmpty: Boolean = false

  override def toString = "(" + head + "," +  tail.toString + ")"
}
