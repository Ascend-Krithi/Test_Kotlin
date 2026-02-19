package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class NotificationServicesPage {
    fun verifyNotificationScreen() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.notification_services_screen)).check(matches(isDisplayed()))
    }
    fun tapNext() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.next_button)).perform(click())
    }
}