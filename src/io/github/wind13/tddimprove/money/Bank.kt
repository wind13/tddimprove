package io.github.wind13.tddimprove.money

class Bank {
    private var rates: MutableList<Rate> = ArrayList<Rate>()

    fun addRate(currency1: String, currency2: String, rate: Int): Unit {
        rates.add(Rate(currency1, currency2, rate))
    }

    fun rate(currency1: String, currency2: String): Int {
        return rates.find { it.currency1 == currency1 && it.currency2 == currency2 }?.rate?:1
    }

    fun reduce(money: Money, currency: String): Money {
        return money
    }

}
