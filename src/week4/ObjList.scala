package week4

/**
 * @author: Dima Legeza
 * @since: 25.06.14
 */
object ObjList {

  def apply[T](a: T, b: T) : List[T] = new Cons(a, new Cons(b, new Nil))

  def apply() = new Nil

  def apply[T](a: T): List[T] = new Cons(a, new Nil)

}
