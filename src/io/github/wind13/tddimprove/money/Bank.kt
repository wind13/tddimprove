package io.github.wind13.tddimprove.money

class Bank {
    private var rates: List<Rate> = ArrayList<Rate>()

    fun addRate(currency1: String, currency2: String, rate: Int): List<Rate> {
        return rates
    }

    fun rate(currency1: String, currency2: String): Int {
        return rates.find { it.currency1 == currency1 && it.currency2 == currency2 }?.rate?:0
    }

}
