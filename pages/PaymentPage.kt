package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class PaymentPage {
    fun tapPaymentMethod() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.payment_method_section)).perform(click())
    }
    fun tapCreditCardInfo() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.credit_card_info_section)).perform(click())
    }
    fun verifyCreditCardScreen() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.credit_card_screen)).check(matches(isDisplayed()))
    }
    fun enterCreditCardDetails(cardNo: String, expDate: String, cvv: String) {
        // TODO: Replace with actual resource IDs
        onView(withId(R.id.card_number_field)).perform(typeText(cardNo), closeSoftKeyboard())
        onView(withId(R.id.expiry_date_field)).perform(typeText(expDate), closeSoftKeyboard())
        onView(withId(R.id.cvv_field)).perform(typeText(cvv), closeSoftKeyboard())
    }
    fun tapSave() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.save_button)).perform(click())
    }
}