package week4

import java.util.NoSuchElementException

/**
 * @author: Dima Legeza
 * @since: 24.06.14
 */
class Nil[T] extends List[T] {

  override def tail: Nothing = throw new NoSuchElementException("tail.Nil")

  override def head: Nothing = throw new NoSuchElementException("head.Nil")

  override def isEmpty: Boolean = true

  override def toString="nil"

}
