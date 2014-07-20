package week4


/**
 * @author: Dima Legeza
 * @since: 24.06.14
 */
object ListsTest extends App {

  val list = new Cons(1, new Cons(2, new Cons(3, new Cons(4, new Cons(5, new Nil)))))
  val function = new ListFunctions

//  println(function.nth(2, list))
//  println(function.nth(5, list))
//
//  println(function.nth(-1, list))

  val objectList1 = week4.ObjList(1,2)
  println(objectList1)

  val objectList2 = week4.ObjList(1)
  println(objectList2)

  val objectList3 = week4.ObjList()
  println(objectList3)


}
