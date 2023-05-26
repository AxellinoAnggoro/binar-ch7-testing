package com.axellinoanggoro.binar_ch7_testing

object RegistrationUtil {
    private val existingUsers = listOf("a", "b", "c", "d")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        if (username in existingUsers){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count{it.isDigit()} < 2){
            return false
        }
        return true
    }
}