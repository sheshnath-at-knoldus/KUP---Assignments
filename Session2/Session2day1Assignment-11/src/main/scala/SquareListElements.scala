object SquareListElements extends App{

  val list = List(4,8,3,6)
  //exception for the input value
  try {
    if (list.isEmpty) throw new Exception("list is empty  ")
  } catch {
    case e: Exception => println("An error occured " + e.getMessage())
  }


  // square list using pattern matching  this method is used to find the squares of the elements in the list using Pattern Matching
  def squareListUsingPatternMatching(list: List[Int]): List[Int] =
    list match {
      case Nil => Nil
      case listHead :: listTail => listHead * listHead :: squareListUsingPatternMatching(listTail)
    }


  //square List using Map this method used Map to find the square of the elements of the list
  def squareListUsingMap(list: List[Int]): List[Int] = {
    val squaredNumber = (inputNumber: Int) => inputNumber * inputNumber
    list.map(squaredNumber)
  }

}
