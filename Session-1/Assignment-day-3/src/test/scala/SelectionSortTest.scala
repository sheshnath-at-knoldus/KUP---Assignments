import org.scalatest.funsuite.AnyFunSuite

class SelectionSortTest extends AnyFunSuite{
  test("Test case 1") {
    val list = List(5, 3, 2, 4, 6)
    val lenghthOfList = list.length
    val selection = SelectionSort.sortTheList(list,0,lenghthOfList)
    val sortedList = List(2, 3, 4, 5, 6)
    assert(selection == sortedList)
  }
  test("Test case 2 ") {
    val list = List(89,12,56,34,89,34)
    val lenghthOfList = list.length
    val selection = SelectionSort.sortTheList(list, 0, lenghthOfList)
    val sortedList = List(12,34,34,56,89,89)
    assert(selection == sortedList)
  }

}
