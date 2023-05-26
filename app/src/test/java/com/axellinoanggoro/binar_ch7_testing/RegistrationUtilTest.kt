package com.axellinoanggoro.binar_ch7_testing

import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest{
    @Test
    fun validUsernameAndCorrectlyRepeatedPassword_return_true(){
        val result = RegistrationUtil.validateRegistrationInput(
            "asdf",
            "1234",
            "1234"
        )
        assertEquals("OK", result, true)
    }

    @Test
    fun usernameEmpty(){
        val user = "qwerty"
        val result = RegistrationUtil.validateRegistrationInput(user, "1234", "1234")
        assertEquals("OK", result, true)
    }

    @Test
    fun existingUsername(){
        val user = "b"
        val result = RegistrationUtil.validateRegistrationInput(user, "1234", "1234")
        assertEquals("OK", result, false)
    }


}