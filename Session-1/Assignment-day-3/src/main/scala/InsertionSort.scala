class InsertionSort extends App{

  def sortList(list :List[Int],index : Int,length : Int,key : Int): Unit = {
    if(index==length) list
    else
      {
        val  key2 = list(index)
        val j = index-1
        val list1 :List[Int] =helper1( list,j,key2)
        val j2 = helper2(list ,j,key2)
        val list2 : List[Int]= list2(j2 + 1) = key2
      }
  }

}
