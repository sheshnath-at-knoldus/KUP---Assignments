import scala.annotation.tailrec
import scala.io.StdIn

object FactorialTailRecursion extends App{
   val inputNumber = StdIn.readInt()

   @tailrec
   def getFactorial(inputNumber: Int, initialValue: Long): Long  = {
       if (inputNumber <= 1) initialValue
       else
         getFactorial(inputNumber - 1, inputNumber * initialValue)
     }
   println(getFactorial(inputNumber, 1))
 }

