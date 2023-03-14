import org.scalatest.funsuite.AnyFunSuite


class ElectricityBillCalculatorTest extends AnyFunSuite{
test("ElectricityCharges"){
  val caseClassReference = ElectricityBill(123,"sheshu","noida",5062,5904)
  assert(caseClassReference.calculateCharges(caseClassReference.currentUnit,caseClassReference.previousUnit)==7073.51)
}
}
