/**
 * @author: Dima Legeza
 * @since: 20.06.14
 */
class Rational(x: Int, y: Int) {

  val numer = x
  val denom = y

  def add(that: Rational) = new Rational(numer * that.denom + denom * that.numer, denom * that.denom)

  def neg() = new Rational(-x, y)

  def sub(that: Rational) = new Rational(numer * that.denom - that.numer * denom, denom * that.denom)


  override def toString = numer + "/" + denom

}


object TestRational extends App {

  val x = new Rational(1,3)
  val y = new Rational(5,7)
  val z = new Rational(3,2)
  println(x.add(y))
  println(x.sub(y).sub(z))

}
