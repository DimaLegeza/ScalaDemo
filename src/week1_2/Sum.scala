/**
 * @author: Dima Legeza
 * @since: 04.06.14
 */
object Sum extends App{

  def sum(f: Int => Int)(a: Int, b: Int) = {
    def loop(a:Int, acc: Int): Int  ={
      if (a > b) acc
      else loop(a+1, f(a) + acc)
    }
    loop(a, 0)
  }

  sum(x => x*x)(1,2)

}
