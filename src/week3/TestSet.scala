package week3

/**
 * @author: Dima Legeza
 * @since: 23.06.14
 */
object TestSet extends App{
  val s1 = new NonEmpty(-10)
  val s2 = new NonEmpty(0)
  val s3 = s2 incl 3 incl 4 incl 2 incl -1

  val s4 = s1 union s3
  println(s3)
  println(s4)

  val a: Array[NonEmpty] = Array(new NonEmpty(1, new Empty, new Empty))
  //val b: Array[IntSet] = a
  //b(0) = new Empty
  val s: NonEmpty = a(0)
}
