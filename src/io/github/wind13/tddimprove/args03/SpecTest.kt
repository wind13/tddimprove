package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test

object SpecTest {

    @Test
    fun test_create_spec(): Unit {
        val spec:Spec = Spec("l:bool:true")
    }
}