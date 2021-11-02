package edu.KUP

class SquareList {

  def squareListMatch(xs: List[Int]): List[Int] =
    xs match {
      case List() => xs
      case y :: ys => y * y :: squareListMatch(ys)
    }

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (temp => temp * temp)

}

