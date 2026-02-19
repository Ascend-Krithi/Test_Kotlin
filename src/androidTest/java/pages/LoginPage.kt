package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import com.dsg.app.utils.EspressoUtils

object LoginPage {

    // TODO: Replace with actual resource IDs
    private val usernameField = withId(R.id.username_field) // TODO
    private val passwordField = withId(R.id.password_field) // TODO
    private val loginButton = withId(R.id.login_button)     // TODO
    private val homeScreen = withId(R.id.home_screen)       // TODO
    private val errorMessage = withId(R.id.error_message)   // TODO

    fun verifyLoginScreen() {
        EspressoUtils.waitForView(usernameField)
        EspressoUtils.waitForView(passwordField)
    }

    fun enterUsername(username: String) {
        onView(usernameField).perform(clearText(), typeText(username), closeSoftKeyboard())
    }

    fun enterPassword(password: String) {
        onView(passwordField).perform(clearText(), typeText(password), closeSoftKeyboard())
    }

    fun tapLoginButton() {
        onView(loginButton).perform(click())
    }

    fun verifyHomeScreen() {
        EspressoUtils.waitForView(homeScreen)
    }

    fun verifyErrorMessage() {
        EspressoUtils.waitForView(errorMessage)
    }
}