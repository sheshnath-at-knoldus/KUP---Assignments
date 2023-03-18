import scala.annotation.tailrec
object SelectionSort extends App{
  @tailrec
  def sortTheList(list : List[Int], index  : Int, listLength : Int ):List[Int]= {
    if(index ==listLength) list
    else
    { val minimumIndex =index
      val compareIndex = index + 1
      val minIndex = helperFunction(list,compareIndex,listLength,minimumIndex)
      val temp = list(minIndex)
      val swappedList = list.updated(minIndex, list(index)).updated(index, temp)
      sortTheList(swappedList,index +1, listLength)
    }
  }

  @tailrec
  def helperFunction(list: List[Int], compareIndex: Int, listLength: Int, minimumIndex: Int): Int = {
    if (compareIndex == listLength) {
      minimumIndex
    } else if (list(compareIndex) < list(minimumIndex)) {

      helperFunction(list, compareIndex + 1, listLength, compareIndex)
    } else {
      helperFunction(list, compareIndex + 1, listLength, minimumIndex)
    }
  }
}