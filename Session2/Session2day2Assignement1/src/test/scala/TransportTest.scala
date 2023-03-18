import org.scalatest.funsuite.AnyFunSuite

class TransportTest  extends AnyFunSuite{

test("Test case 1") {
  val car = new Car()
  val actualValue =car.move
  val expectedValue ="A Car can be driven"
  assert(actualValue===expectedValue)
}
  test("Test case 2") {
    val boat = new Boat()
    val actualValue = boat.move
    val expectedValue = "A Boat can be sailed"
    assert(actualValue === expectedValue)
  }

  test("Test case 3") {
    val aeroplane = new Aeroplane()
    val actualValue = aeroplane.move
    val expectedValue = "An Aeroplane can be flown"
    assert(actualValue === expectedValue)
  }
  test("Test case 4") {
    val flyingCar = new FlyingCar()
    val actualValue = flyingCar.move
    val expectedValue = "FlyingCars can be driven and Flown"
    assert(actualValue === expectedValue)
  }
  test("Test case 5") {
    val hoverCraft = new HoverCraft()
    val actualValue = hoverCraft.move
    val expectedValue = "HoverCraft can be sailed and Driven"
    assert(actualValue === expectedValue)
  }


}
