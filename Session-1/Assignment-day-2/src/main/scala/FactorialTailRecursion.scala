import scala.annotation.tailrec
import scala.io.StdIn

object FactorialTailRecursion extends App{

    //get factorial method returns the factorial of the inputNumber
   @tailrec
   def getFactorial(inputNumber: Int, initialValue: Long): Long  = {
      if(inputNumber<0) throw new IllegalArgumentException()
      else
       if (inputNumber == 0) initialValue
       else
         getFactorial(inputNumber - 1, inputNumber * initialValue)
     }
 }

