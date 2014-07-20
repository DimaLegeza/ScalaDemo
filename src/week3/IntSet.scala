package week3

/**
 * @author: Dima Legeza
 * @since: 23.06.14
 */
abstract class IntSet {

  def incl(x: Int): IntSet

  def contains(x: Int): Boolean

  def union(other: IntSet): IntSet

}
