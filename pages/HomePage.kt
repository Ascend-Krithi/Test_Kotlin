package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.matches

class HomePage {
    fun verifyHomeScreen() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.home_screen)).check(matches(isDisplayed()))
    }
    fun verifySignedInUser() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.user_profile_icon)).check(matches(isDisplayed()))
    }
    fun searchProduct(keyword: String) {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.search_box)).perform(typeText(keyword), closeSoftKeyboard())
    }
    fun tapViewAll() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.view_all_button)).perform(click())
    }
}