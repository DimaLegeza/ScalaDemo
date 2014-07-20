package week4

/**
 * @author: Dima Legeza
 * @since: 24.06.14
 */
class ListFunctions {

  def nth[T](n: Int, list: List[T]): T = {
    if (list.isEmpty) throw new IndexOutOfBoundsException("reached end of the list")
    if (n == 0) list.head else nth(n-1, list.tail)
  }

}
