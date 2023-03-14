import org.scalatest.funsuite.AnyFunSuite

class FactorialTest extends AnyFunSuite {
  test("FactorialTailRecursion") {
    assert(FactorialTailRecursion.getFactorial(5, 1) === 120)
    assert(FactorialTailRecursion.getFactorial(1, 1) === 1)
    assert(FactorialTailRecursion.getFactorial(34, 1) === 4926277576697053184L)

  }
}
