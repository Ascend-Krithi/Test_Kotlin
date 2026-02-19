package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class LandingPage {
    fun verifyLandingScreen() {
        // TODO: Replace with actual resource ID
        onView(withText("Dicks Sporting Goods")).check(matches(isDisplayed()))
    }
    fun tapSignIn() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.sign_in_button)).perform(click())
    }
}