package matchers

import com.h2.services.Currency
import org.scalatest.flatspec.AnyFlatSpec                     //  terminal ->~testOnly *OrderingSpec
import org.scalatest.matchers.should.Matchers

class OrderingSpec extends AnyFlatSpec with Matchers {

  behavior of "Currency Conversion cost in Comparison"
  it should "report equal costs for 10 USD,10 USD" in {
    val tenUsd:Currency="10 USD"
    val anothertenUsd:Currency="10 USD"

    tenUsd.costInDollars.amount should be >= anothertenUsd.costInDollars.amount

  }
  it should "report higher costs for 100 USD,10 USD" in {
    val tenUsd:Currency="10 USD"
    val hundredUsd:Currency="100 USD"

    hundredUsd.costInDollars.amount should be > tenUsd.costInDollars.amount

  }

  it should "report 1 USD < 10 USD" in {
    val oneUsd:Currency="1 USD"
    val tenUsd:Currency="10 USD"

    oneUsd.costInDollars.amount should be < tenUsd.costInDollars.amount

  }
  it should "report NZD < USD" in {
    "NZD" should be < "USD"
  }
}
