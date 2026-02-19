package com.dsg.app.utils

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId

object Actions {
    fun clickById(resId: Int) {
        onView(withId(resId)).perform(click())
    }
}