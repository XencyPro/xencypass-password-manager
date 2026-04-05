package com.xencypass

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test
    fun testDemoPassword() {
        assertEquals("demo-password", PasswordManager.generateDemo())
    }
}
