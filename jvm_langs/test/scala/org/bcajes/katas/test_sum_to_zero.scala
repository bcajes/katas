import org.junit.runner.RunWith
import org.scalatest.junit._
import org.scalatest._
import scala.runtime.ScalaRunTime.stringOf

@RunWith(classOf[JUnitRunner])
class TestSumToZero extends FunSuite {

  test("should return entire array that sums to zero") {
  	val stz = new SumToZero
	  val it_res = stz.process(Array(1,2,-3))
	  val res = stringOf(it_res.toArray)
	    assert( res == "Array(Array(1, 2, -3))",
		    "res: " + res)
  }

  test("should return empty iterator for array"){
    val stz = new SumToZero
    val it_res = stz.process(Array(1,2,3,4))
    assert(it_res.hasNext, stringOf(it_res.toArray))
  }

  test("should return three nums that sum to zero from set of four"){
    val stz = new SumToZero
    val it_res = stz.process(Array(125, 124, -100, -25))
    val res = stringOf(it_res.toArray)
    assert( res == "Array(Array(125, -100, -25))",
      "res: " + res)
  }


}
