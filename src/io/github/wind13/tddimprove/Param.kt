package io.github.wind13.tddimprove

class Param(val input:String) {
  private val params = input.split(" ")
  private val label: String = params.get(0).trim()
  private val value: String = if (params.size > 1) params.get(1).trim() else ""

  fun getLabel(): String {
    return label
  }

  fun getValue(): String {
    return value
  }
}
