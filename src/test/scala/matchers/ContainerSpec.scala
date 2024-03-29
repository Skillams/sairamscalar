package matchers
import com.h2.services.Currency


class ContainerSpec extends UnitSpec {
  behavior of "Currencies in a wallet"
  it should "contain a currency that is added to a List wallet" in {
    val oneUsd:Currency="1 USD"
    val twoEuros:Currency="2 EUR"
    val tenCad:Currency="10 CAD"

    val wallet=List(oneUsd,twoEuros,tenCad)

    wallet should contain (oneUsd)

  }


  it should "contain a currency that is added to a Set wallet" in {
    val oneUsd:Currency="1 USD"
    val twoEuros:Currency="2 EUR"
    val tenCad:Currency="10 CAD"

    val wallet=Set(oneUsd,twoEuros,tenCad)

    wallet should contain (oneUsd)

  }
  it should "contain a currency that is added to a Map wallet" in {
    val oneUsd:Currency="1 USD"
    val twoEuros:Currency="2 EUR"
    val tenCad:Currency="10 CAD"

    val wallet:Map[String,Currency]=Map (
      "USD"->oneUsd,
      "EUR"->twoEuros,
      "CAD"->tenCad
    )

    wallet should contain ("USD"->oneUsd)
  }

  it should "contain a oneOF 1 USD that is added to a Set wallet" in {
    val oneUsd:Currency="1 USD"
    val twoEuros:Currency="2 EUR"
    val tenCad:Currency="10 CAD"
    val hundredInr:Currency="100 INR"

    val wallet:Set[Currency]=Set(oneUsd,oneUsd,twoEuros,twoEuros,tenCad,tenCad)

    wallet should contain oneOf(oneUsd,hundredInr)
    wallet should contain oneElementOf List(oneUsd,hundredInr)

  }

  it should "contain a noneOF 100 INR that is added to a Set wallet" in {
    val oneUsd:Currency="1 USD"
    val twoEuros:Currency="2 EUR"
    val tenCad:Currency="10 CAD"
    val hundredInr:Currency="100 INR"

    val wallet:Set[Currency]=Set(oneUsd,oneUsd,twoEuros,twoEuros)

    wallet should contain noneOf(tenCad,hundredInr)
    wallet should contain noElementsOf List(tenCad,hundredInr)

  }
  it should "not contain a currency that is added to a List wallet" in {
    val oneUsd: Currency = "1 USD"
    val twoEuros: Currency = "2 EUR"
    val tenCad: Currency = "10 CAD"
    val tenZd: Currency = "10 NZD"

    val wallet = List(oneUsd, twoEuros, tenCad)

    wallet should not contain tenZd

  }


  it should "not contain a currency that is added to a Set wallet" in {
    val oneUsd: Currency = "1 USD"
    val twoEuros: Currency = "2 EUR"
    val tenCad: Currency = "10 CAD"
    val tenZd: Currency = "10 NZD"

    val wallet = Set(oneUsd, twoEuros, tenCad)

    wallet should not contain tenZd

  }
  it should "not contain a currency that is added to a Map wallet" in {
    val oneUsd: Currency = "1 USD"
    val twoEuros: Currency = "2 EUR"
    val tenCad: Currency = "10 CAD"
    val tenZd: Currency = "10 NZD"

    val wallet: Map[String, Currency] = Map(
      "USD" -> oneUsd,
      "EUR" -> twoEuros,
      "CAD" -> tenCad
    )

    wallet should not contain ("NZD" -> tenZd)
  }
}
