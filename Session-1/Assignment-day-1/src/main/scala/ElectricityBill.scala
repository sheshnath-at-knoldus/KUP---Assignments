case class ElectricityBill(accountNumber: Int, accountUserName: String, address: String, previousUnit: Int, currentUnit: Int) {
    private val unitSlab = currentUnit - previousUnit

       //method to calculate charges
    def calculateCharges(currentUnit: Int, previousUnit: Int): Double = {
      //exception handing
      try {
        if (unitSlab < 0) {
          throw new Exception("Negative Unit")
        }
          val gstCharges = 0.18
          if (unitSlab == 0) {
            val totalCharges = 0.0
            totalCharges
          } else if (unitSlab > 0 && unitSlab <= 250) {
            val totalCharges = ((unitSlab * 5.25) * gstCharges) + (unitSlab * 5.25)
            totalCharges
          } else if (unitSlab > 250 && unitSlab <= 450) {
            val difference = unitSlab - 250
            val totalCharges = (250 * 5.25 + difference * 6.75) * gstCharges + (250 * 5.25 + difference * 6.75)
            totalCharges
          } else {
            val difference = (unitSlab - 450)
            val totalCharges = (250 * 5.25 + 200 * 6.75 + difference * 8.5) * gstCharges + (250 * 5.25 + 200 * 6.75 + difference * 8.5)
            totalCharges
          }
    }catch {
        case e: Exception =>
          println("An error occurred: " + e.getMessage)
          //explicit return
          0.0
      }
    }
  }


