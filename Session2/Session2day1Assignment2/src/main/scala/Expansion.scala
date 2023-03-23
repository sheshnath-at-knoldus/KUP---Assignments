
object Expansion  {

    //val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num) this is expanded
    val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
      override def apply(function: Int => Int, inputNumber: Int): Int = function(inputNumber)
    }

    //  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
    val sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
      override def apply(listValues: List[Int]): Int = listValues.sum
      }

    //  val add: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
    val addTwoNumber: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
      override def apply(inputNumber1: Int, inputNumber2: Int): Int = inputNumber1 + inputNumber2
    }

}
