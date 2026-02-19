package com.dsg.app.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class RewardsPage {
    fun verifyRewardsSection() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.rewards_section)).check(matches(isDisplayed()))
    }
    fun tapTenDollarReward() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.ten_dollar_reward)).perform(click())
    }
    fun verifyRewardApplied() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.reward_applied)).check(matches(isDisplayed()))
    }
    fun verifyOrderSummaryCost() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.order_summary_cost)).check(matches(isDisplayed()))
    }
    fun removeReward() {
        // TODO: Replace with actual resource ID
        onView(withId(R.id.remove_reward_button)).perform(click())
    }
}