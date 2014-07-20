/**
 * @author: Dima Legeza
 * @since: 04.06.14
 */
object Product extends App{

  // not tail recursive
  def prod(f:Int => Int)(a:Int, b:Int) :Int = {
    if (a > b) 1
    else f(a) * prod(f)(a+1,b)
  }

  // tail recursive
  def product(f:Int => Int)(a: Int, b: Int) : Int = {
    def loop(a: Int, acc: Int): Int = if (a>b) acc else loop(a + 1, acc*f(a))
    loop(a, 1)
  }

  println(product(x=>x*x)(1,4))
  println(prod(x=>x)(1,7))

  def mapReduce(f: Int => Int, map: (Int, Int) => Int, default: Int)(a: Int, b: Int) = {
    def loop (a:Int, acc:Int): Int = if (a>b) acc else loop(a+1, map(acc, f(a)))
    loop(a, default)
  }

  def mapRed(f: Int => Int, map: (Int, Int) => Int, default: Int)(a: Int, b: Int): Int = {
    if (a>b) default
    else map(f(a),mapRed(f, map, default)(a+1, b));
  }

  def productMapReduce(a: Int, b: Int) = mapReduce(x => x, (x, y) => x * y, 1)(a,b)

  println(productMapReduce(1,7))
}
