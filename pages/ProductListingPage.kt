package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class ProductListingPage {
    fun verifyListingScreen() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.product_listing_screen)).check(matches(isDisplayed()))
    }
    fun tapAnyProduct() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.product_item)).perform(click())
    }
}