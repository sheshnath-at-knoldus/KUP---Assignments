
object Transport extends App{
  val car = new Car()
  println(car.move)
  val boat = new Boat()
  println(boat.move)
  val aeroplane = new Aeroplane
  println(aeroplane.move)
  val hoverCraft = new HoverCraft
  println(hoverCraft.move)
  val flyingCar = new FlyingCar
  println(flyingCar.move)
}

trait Vehicle {
  def move: String
}

trait Flying extends Vehicle {
  def move :String
}

trait Sailing extends Vehicle {
  def move :String
}
trait Driving extends Vehicle {
  def move :String
}


class Car extends Driving {
  override def move(): String = {
    "A Car can be driven"
  }
}

class Boat extends Sailing {
  override def move(): String = {
    "A Boat can be sailed"
  }
}

class Aeroplane extends Flying {
  override def move(): String = {
    "An Aeroplane can be flown"
  }
}

class FlyingCar extends Flying with Driving {
  override def move(): String = {
    "FlyingCars can be driven and Flown"
  }
}

class HoverCraft extends Sailing with Driving {
  override def move(): String = {
    "HoverCraft can be sailed and Driven"
  }
}