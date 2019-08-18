package io.github.wind13.tddimprove

class Param(input:String) {
  private val params = input.split(" ")

  fun getLabel(): String {
    return params.get(0).trim()
  }

  fun getType(): String {
    if (params.size > 1) {
      return params.get(1).trim()
    } else {
      return ""
    }
  }
}
