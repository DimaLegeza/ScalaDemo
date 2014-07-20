/**
 * @author: Dima Legeza
 * @since: 01.06.14
 */
object Hello extends App {
  println("------------------------------------------")
  println(min(Array(-2,5,7,9,10)))
  println("------------------------------------------")

  for (value <- getFibonacciArray(23)) {
    println(value)
  }
  println("------------------------------------------")

  println(factorial(5))

  println("------------------------------------------")

  println(fact(6))


  def min(a: Array[Int]):Int = {
    var minValue = a(0)
    for (value <- a) {
      if (minValue > value) minValue = value
    }
    return minValue
  }

  def getFibonacciArray(count: Int): Array[Int] = {
    val arr:Array[Int] = new Array[Int](count)
    for (i <- 0  to count - 1) {
      arr(i) = newfibonacciValue(i)
    }
    return arr
  }

  def newfibonacciValue(value: Int): Int = if (value < 2) 1 else newfibonacciValue(value - 1) + newfibonacciValue(value - 2)

  // not tail recursive
  def factorial(value: Int): Int = if (value == 0) 1 else value * factorial(value - 1)

  // tail recursive
  def fact(value: Int): Int = {
    def loop(value: Int, accum: Int): Int = if (value == 0) accum else loop(value - 1, accum * value)
    return loop(value, 1)
  }




}
