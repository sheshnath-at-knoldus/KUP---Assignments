import org.scalatest.funsuite.AnyFunSuite


class ElectricityBillCalculatorTest extends AnyFunSuite{
test("ElectricityCharges"){
  val caseClassReference = ElectricityBill(123,"sheshu","noida",5062,5904)
  assert(caseClassReference.calculateCharges(caseClassReference.currentUnit,caseClassReference.previousUnit)==7073.51)
}

  test("for small values") {
    val caseClassReference = ElectricityBill(1, "shehnath yadav", "Gorakhpur", 50, 5904)
    assert(caseClassReference.calculateCharges(caseClassReference.currentUnit, caseClassReference.previousUnit) == 57343.869999999995)
  }

  test("for negative value") {
    val caseClassReference = ElectricityBill(1, "shehnath yadav", "Gorakhpur", 10000, -5904)
    assert(caseClassReference.calculateCharges(caseClassReference.currentUnit, caseClassReference.previousUnit) == 0.0)
  }


  test("for zero value") {
    val caseClassReference = ElectricityBill(1, "shehnath yadav", "Gorakhpur", 0, 5904)
    assert(caseClassReference.calculateCharges(caseClassReference.currentUnit, caseClassReference.previousUnit) == 57845.369999999995)
  }
}
