class SumToZeroNotFound(msg:String=null, cause:Throwable=null)
  extends java.lang.Exception (msg, cause) {}


class SumToZero{
  def process(arr: Array[Int], size: Int = 3): Array[Int] = {
    for(combination <- arr.combinations(size))
      if(combination.sum == 0)  //note: can yield combinations here if we want to find all combinations that sum to zero
        return combination
    throw new SumToZeroNotFound()
  }
}

