package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class CheckoutPage {
    fun verifyCheckoutScreen() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.checkout_screen)).check(matches(isDisplayed()))
    }
    fun tapContinueToPayment() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.continue_to_payment_button)).perform(click())
    }
    fun verifyPlaceOrderEnabled() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.place_order_button)).check(matches(isDisplayed()))
    }
    fun tapPlaceOrder() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.place_order_button)).perform(click())
    }
    fun verifyOrderConfirmation() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.order_confirmation_screen)).check(matches(isDisplayed()))
    }
}