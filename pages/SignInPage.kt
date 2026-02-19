package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.assertion.ViewAssertions.matches

class SignInPage {
    fun verifySignInScreen() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.sign_in_screen)).check(matches(isDisplayed()))
    }
    fun enterCredentials(username: String, password: String) {
        // TODO: Replace with actual resource IDs
        onView(withId(R.id.username_field)).perform(typeText(username), closeSoftKeyboard())
        onView(withId(R.id.password_field)).perform(typeText(password), closeSoftKeyboard())
    }
    fun tapSignIn() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.sign_in_submit_button)).perform(click())
    }
}