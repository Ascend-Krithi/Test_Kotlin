package com.dsg.app.utils

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import org.hamcrest.Matcher
import android.view.View

object EspressoUtils {
    /**
     * Waits for a view to be displayed.
     * @param matcher The view matcher.
     */
    fun waitForView(matcher: Matcher<View>, timeout: Long = 5000) {
        // TODO: Implement robust waiting mechanism, e.g., using IdlingResource or polling
        onView(matcher).check(matches(isDisplayed()))
    }
}