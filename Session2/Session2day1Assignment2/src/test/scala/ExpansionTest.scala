import org.scalatest.funsuite.AnyFunSuite

class ExpansionTest extends AnyFunSuite{

  test("Test case 1"){
    val addTwoNumber:Int = Expansion.addTwoNumber(4,9)
    val result = 13
    assert(addTwoNumber === result)
  }
  test("Test case 2") {
    val dummylist = List(3,6,8)
    val sumOfList: Int = Expansion.sumOfList(dummylist)
    val result = 17
    assert(sumOfList === result)
  }
  test("Test case 3") {
    def multiply(inputNumer : Int):Int = {
      inputNumer*2
    }
    val higherOrderFunction: Int = Expansion.higherOrderFunction(multiply, 2)
    val result = 4
    assert(higherOrderFunction === result)
  }
}
