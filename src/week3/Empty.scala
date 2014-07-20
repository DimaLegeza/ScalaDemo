package week3

/**
 * @author: Dima Legeza
 * @since: 23.06.14
 */
class Empty extends IntSet {
  override def union(other: IntSet): IntSet = other

  override def contains(x: Int): Boolean = false

  override def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)

  override def toString() = "."
}
