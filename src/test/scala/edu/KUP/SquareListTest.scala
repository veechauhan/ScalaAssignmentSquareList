package edu.KUP

import org.scalatest.flatspec.AnyFlatSpec
import scala.language.postfixOps

class SquareListTest extends AnyFlatSpec {
  val list: List[Int] = List(4, 5, 0, 7)
  val list1: List[Int] = List(1,2,3,4)
  val emptyList: List[Int] = List()
  val classObject = new SquareList

  //--------Case 1 SquareListMatch Method --------//
  "SquareListMatch" should "give square of each element in list " in
    assert(classObject.squareListMatch(list) == List(16, 25, 0, 49))

  //--------Case 2 SquareListMatch Method --------//
  "SquareListMatch check emptyList" should "give square of each element in list " in
    assert(classObject.squareListMatch(emptyList).isEmpty)

  //--------Case 4 SquareListMap Method --------//
  "SquareListMap" should "give square of each element in list " in
    assert(classObject.squareListMap(list) == List(16, 25, 0, 49))

  //--------Case 4 SquareListMatch Map --------//
  "SquareListMap check emptyList" should "give square of each element in list " in
    assert(classObject.squareListMatch(emptyList).isEmpty)
}
