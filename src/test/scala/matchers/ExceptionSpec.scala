package matchers

import com.h2.services.Currency                       //    terminal ->~testOnly *ExceptionSpec

class ExceptionSpec extends UnitSpec {

  behavior of "Currency during expection"
  it should "throw an exception when invalid number is provided in the currency string" in {
    a[NumberFormatException] should be thrownBy Currency.stringToCurrency(money="Two USD")
    an[NumberFormatException] should be thrownBy Currency.stringToCurrency(money="Two USD")
  }

  it should "provide a detailed description of exception" in {
    val exception=the[NumberFormatException] thrownBy Currency.stringToCurrency(money="Two USD")
    exception.getMessage should include("Two")

  }
}
