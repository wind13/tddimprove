package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test

object CommanderTest {

    @Test
    fun test_create_commander(): Unit {
        val commander:Commander = Commander()
        assert(commander.toString().length > 0)
    }
}