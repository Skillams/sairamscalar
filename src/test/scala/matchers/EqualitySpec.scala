package matchers

import com.h2.services.Currency
import org.scalatest.flatspec.AnyFlatSpec                      // terminal ->~testOnly *EqualitySpec
import org.scalatest.matchers.should.Matchers

class EqualitySpec extends AnyFlatSpec with Matchers {

  behavior of "Currency Equals"
  it should "match two 10 USD currencies as equal 'should equal' syntax" in {
    val currency1:Currency="10 USD"
    val currency2:Currency="10 USD"

    currency1 should equal (currency2)
  }

  it should "match two 10 USD currencies as equal 'should ===' syntax" in {
    val currency1:Currency="10 USD"
    val currency2:Currency="10 USD"

    currency1 should === (currency2)
  }

  it should "match two 10 USD currencies as equal 'shouldEqual' syntax" in {
    val currency1:Currency="10 USD"
    val currency2:Currency="10 USD"

    currency1 shouldEqual currency2
  }
  it should "match two 10 USD currencies as equal 'shouldBe' syntax" in {
    val currency1:Currency="10 USD"
    val currency2:Currency="10 USD"

    currency1 shouldBe currency2
  }
  it should "match two 10 USD currencies as equal 'should be' syntax" in {
    val currency1:Currency="10 USD"
    val currency2:Currency="10 USD"

    currency1 should be (currency2)
  }
  it should " not match two 10 USD and 100 USD currencies as equal when using 'should be' syntax" in {
    val currency1: Currency = "10 USD"
    val currency2: Currency = "100 USD"

    currency1 should not be currency2
  }

  it should " not match two 10 USD and 100 USD currencies as equal when using 'should equal' syntax" in {
    val currency1: Currency = "10 USD"
    val currency2: Currency = "100 USD"

    currency1 should not equal currency2
  }

}