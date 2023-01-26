package matchers


import org.scalatest.flatspec.AnyFlatSpec                     //  terminal ->testOnly *matchers*
import org.scalatest.matchers.should.Matchers

abstract class UnitSpec extends AnyFlatSpec with Matchers {

  class EqualitySpec extends UnitSpec {
    class StringSpec extends UnitSpec {
      class OrderingSpec extends UnitSpec {

      }
    }
  }
}