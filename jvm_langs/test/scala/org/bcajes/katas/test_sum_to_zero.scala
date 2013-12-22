import org.junit.runner.RunWith
import org.scalatest.junit._
import org.scalatest._
import scala.runtime.ScalaRunTime.stringOf

@RunWith(classOf[JUnitRunner])
class TestSumToZero extends FunSuite {

  test("should return entire array that sums to zero") {
  	val stz = new SumToZero
	  val res = stz.process(Array(1,2,-3))
	  val str_res = stringOf(res)
	    assert( str_res == "Array(1, 2, -3)",
		    "res: " + str_res)
  }

  test("should raise NotFound exception if no combination sums to zero"){
    val stz = new SumToZero
    intercept[SumToZeroNotFound]{
      stz.process(Array(1,2,3,4))
    }
  }

  test("should return first set of nums that sum to zero"){
    val stz = new SumToZero
    val res = stz.process(Array(125, 124, -100, -25, 1, 2, -3, 10, 100))
    val str_res = stringOf(res)
    assert( str_res == "Array(125, -100, -25)",
      "res: " + str_res)
  }


}
