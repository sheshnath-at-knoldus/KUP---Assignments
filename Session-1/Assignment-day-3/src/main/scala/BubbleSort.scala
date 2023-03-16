
object BubbleSort extends App {
  val arry = Array(23, 90, 12, 18)
  val length = arry.length

  def sort(array: Array[Int], length: Int): Array[Int] = {
    if (length == 0) array
    else {
      val helperArray: Array[Int] = adjacentSwap(array, 0, length)
      val sortedArray: Array[Int] = sort(helperArray, length - 1)
      sortedArray
    }
  }

  def adjacentSwap(array: Array[Int], index: Int, length: Int): Array[Int] = {
    if (index == length || index + 1 > array.length - 1)  {
      array
    } else if (array(index) > array(index + 1)) {
      val temp = array(index + 1)
      array(index + 1) = array(index)
      array(index) = temp
      adjacentSwap(array, index + 1, length)
      array
    } else {
      adjacentSwap(array, index + 1, length)
    }
  }
  println(sort(arry, length).mkString(", "))
}
