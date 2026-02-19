package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class CartPage {
    fun verifyCartScreen() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.cart_screen)).check(matches(isDisplayed()))
    }
    fun tapCheckout() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.checkout_button)).perform(click())
    }
    fun removeAllProducts() {
        // TODO: Implement removal logic
    }
}