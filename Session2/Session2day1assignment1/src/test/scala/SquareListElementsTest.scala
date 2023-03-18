import org.scalatest.funsuite.AnyFunSuite

class SquareListElementsTest extends AnyFunSuite {
  test("Test case 1 ") {
    val actualValue = List(4,3,2)
    val list =List(16,9,4)
    val squareListMap = SquareListElements.squareListUsingMap(actualValue)
    assert(squareListMap === list)
  }

  test("Test case 2 ") {
    val actualValue = List(4, 3, 2)
    val list = List(16, 9, 4)
    val squareListMap = SquareListElements.squareListUsingPatternMatching(actualValue)
    assert(squareListMap === list)
  }

}
