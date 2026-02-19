package com.dsg.app.steps

import com.dsg.app.pages.*
import io.cucumber.java.en.And
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class RewardsSteps {
    @And("user should be able view Revard under My Scorecard Rewards in DSG application")
    fun verifyRewardsSection() { RewardsPage().verifyRewardsSection() }
    @And("user should tap $10 Reward in DSG application")
    fun tapTenDollarReward() { RewardsPage().tapTenDollarReward() }
    @And("user should see reward applied in Order Summary in DSG application")
    fun verifyRewardApplied() { RewardsPage().verifyRewardApplied() }
    @And("user should see Order Summary display overall cost In DSG application")
    fun verifyOrderSummaryCost() { RewardsPage().verifyOrderSummaryCost() }
    @And("user able to remove added reward on tapping X close from order summary in DSG application")
    fun removeReward() { RewardsPage().removeReward() }
    @And("user tap on reward and remove reward in DSG application")
    fun tapAndRemoveReward() { RewardsPage().removeReward() }
    @And("user redirect back to Cart screen and remove the added products in DSG application")
    fun removeProductsFromCart() { CartPage().removeAllProducts() }
}