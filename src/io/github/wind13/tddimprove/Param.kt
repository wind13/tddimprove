package io.github.wind13.tddimprove

class Param(input:String) {
  fun getLabel(): String {
    return this.input.split(" ").get(0)
  }

  public val input = input.trim()

}
