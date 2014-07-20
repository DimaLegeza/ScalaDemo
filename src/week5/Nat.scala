package week5

/**
 * @author: Dima Legeza
 * @since: 27.06.14
 */
abstract class Nat {

  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat

}

//private object Zero extends Nat;
//
//private class Succ(val n: Nat) extends Nat;
