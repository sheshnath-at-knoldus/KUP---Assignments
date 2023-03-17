import scala.annotation.tailrec

object BubbleSort extends App {

  def sort(list: List[Int], length: Int): List[Int] = {
    if (length == 0) list
    else {
      val helperArray: List[Int] = adjacentSwap(list, 0, length)
      val sortedArray: List[Int] = sort(helperArray, length - 1)
      sortedArray
    }
  }

  @tailrec
  def adjacentSwap(array: List[Int], index: Int, length: Int): List[Int] = {
    if (index == length || index + 1 > array.length - 1)  {
      array
    } else if (array(index) > array(index + 1)) {
      val swappedList = array.updated(index, array(index + 1)).updated(index + 1, array(index))
      adjacentSwap(swappedList, index + 1, length)
    } else {
      adjacentSwap(array, index + 1, length)
    }
  }
}
