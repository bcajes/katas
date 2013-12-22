class SumToZero{
  def process(arr: Array[Int], size: Int = 3): Iterator[Array[Int]] = {
    for (combination <- arr.combinations(size)
         if combination.sum == 0) yield
      combination
  }
}



