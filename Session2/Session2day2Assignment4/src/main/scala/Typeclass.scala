

//trait
trait Show[A] {
  def show(a: A): String
}

object Typeclass {

  implicit val intShow: Show[Int] = new Show[Int] {
    def show(aValue: Int): String = aValue.toString
  }

  implicit val doubleShow: Show[Double] = new Show[Double] {
    def show(aValue: Double): String = aValue.toString
  }

  implicit val longShow: Show[Long] = new Show[Long] {
    def show(aValue: Long): String = aValue.toString
  }

  case class Position(inputX: Int, inputY: Int)
  implicit val positionShow: Show[Position] = new Show[Position] {
    def show(positionType: Position) = s"Pos(x: ${positionType.inputX}, y: ${positionType.inputY})"
  }

}
