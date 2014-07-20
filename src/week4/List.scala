package week4

/**
 * @author: Dima Legeza
 * @since: 24.06.14
 */
trait List[T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]
}
