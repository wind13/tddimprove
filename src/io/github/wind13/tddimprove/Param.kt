package io.github.wind13.tddimprove

class Param(input:String) {
  fun getLabel(): String {
    return this.input.split(" ").get(0)
  }

  fun getType(): String {
    if (this.input.split(" ").size > 1) {
      return this.input.split(" ").get(1)
    } else {
      return ""
    }
  }

  public val input = input.trim()

}
