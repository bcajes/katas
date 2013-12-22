import org.junit.runner.RunWith
import org.scalatest.junit._
import org.scalatest._;
import scala.runtime.ScalaRunTime.stringOf

@RunWith(classOf[JUnitRunner])
class SetSuite extends FunSuite {

  test("should return three nums that sum to zero") {
  	val stz = new SumToZero; 
	val it_res = stz.process(Array(1,2,-3,10))
	    val res = stringOf(it_res.toArray)
	    assert( res == "Array(Array(1, 2, -3))", 
		   "res: " + res)
  }

}
