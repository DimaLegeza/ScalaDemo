package week5

/**
 * @author: Dima Legeza
 * @since: 20.07.14
 */
object TestNumbers extends App {


  implicit def toMyInt(x: Int) = new MyInt(x)
  class MyInt(x: Int) {
    private val num = x
    def - (x: Int): MyInt = num -x
    def * (x: Int): MyInt = num * x
    def ! : MyInt = if(num == 0) 1 else((this-1)!) * num
    override def toString = num.toString
  }

  println(10!)

  val modern = List("red", "yellow", "green")
  val classic = "black":: "white":: Nil
  (classic ::: modern).foreach(println)

  Array(1, 2, 3) map (_ + 2) foreach(println);

  class Person(var name: String, private var _age: Int) {
    def age = _age           // Getter for age
    def age_=(newAge:Int) {  // Setter for age
      println("Changing age to: "+newAge)
      _age = newAge
    }
    override def toString = name + " " + _age;
  }

  val person = new Person("Dima", 24);
  println(person)
  person.age_=(25)
  println(person)





}
