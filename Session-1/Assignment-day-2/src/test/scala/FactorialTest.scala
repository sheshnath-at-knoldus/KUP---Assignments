import org.scalatest.funsuite.AnyFunSuite

class FactorialTest extends AnyFunSuite {
  test("Test case 1 if input number is 5 and initial value is 1") {
    assert(FactorialTailRecursion.getFactorial(5, 1) === 120)
  }
  test("Test case 2 if input number is 1 and initial value is 1") {
    assert(FactorialTailRecursion.getFactorial(1, 1) === 1)
  }
  test("Test case 3 if input number is 0 and initial value is 1") {
    assert(FactorialTailRecursion.getFactorial(0, 1) === 1)
  }
  test("Test case 4 if input number is -1 and initial value is 1") {
    assertThrows[IllegalArgumentException] {
      FactorialTailRecursion.getFactorial(-1,1)
    }
  }

}
