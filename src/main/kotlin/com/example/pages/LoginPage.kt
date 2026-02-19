package com.example.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.R

object LoginPage {
    fun enterUsername(username: String) {
        onView(withId(R.id.username)).perform(typeText(username), closeSoftKeyboard())
    }

    fun enterPassword(password: String) {
        onView(withId(R.id.password)).perform(typeText(password), closeSoftKeyboard())
    }

    fun tapLogin() {
        onView(withId(R.id.login_button)).perform(click())
    }
}
