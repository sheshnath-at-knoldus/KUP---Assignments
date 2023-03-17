import org.scalatest.funsuite.AnyFunSuite

class BubbleSortTest extends AnyFunSuite{

  test("Test case 1"){
    val array =List(5,3,2,4,6)
    val lenghthOfArray=array.length
    val bubble = BubbleSort.sort(array,lenghthOfArray)
    val sortedtarray =List(2,3,4,5,6)
    assert(bubble == sortedtarray)
  }
  test("Test case 2") {
    val array = List(90, 34, 23, 4, 99)
    val lenghthOfArray = array.length
    val bubble = BubbleSort.sort(array, lenghthOfArray)
    val sortedtarray = List(4, 23, 34, 90, 99)
    assert(bubble == sortedtarray)
  }

}
