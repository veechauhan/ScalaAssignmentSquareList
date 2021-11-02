package edu.KUP

class SquareList {

  def squareListMatch(xs: List[Int]): List[Int] =
    xs match {
      case List() => xs
      case y :: ys => y * y :: squareListMatch(ys)
    }

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (x => x * x)

}

object main extends App {
  val obj = new SquareList
  val map: Map[String, Int] = Map("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4)
  val list: List[Int] = List(1, 9, 3)
  print(obj.squareListMatch(list) + "\n")
  print(obj.squareListMap(list))
  //  print(map("one"))
}