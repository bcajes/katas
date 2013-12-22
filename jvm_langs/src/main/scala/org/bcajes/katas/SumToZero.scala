class SumToZero{
    def process(arr: Array[Int]): Iterator[Array[Int]] = {
	for (combination <- arr.combinations(3); 
	     if combination.sum == 0) yield
		   combination
    } 


}



