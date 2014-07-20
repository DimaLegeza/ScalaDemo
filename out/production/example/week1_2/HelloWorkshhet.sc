/**
 * @author: Dima Legeza
 * @since: 01.06.14
 */

println(min(Array(-2,5,7,9,10)));



def min(a: Array[Int]) {
  var minValue = a(0);
  for (value <- a) {
    if (minValue > value) minValue = value;
  }
  return minValue;
}