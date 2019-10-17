package com.thoughtworks.android_test_project

import org.junit.Assert.assertTrue
import org.junit.Test

class FailingUnitTest {

    @Test
    fun testThatFails() {
        assertTrue("This should fail", false)
    }
}
