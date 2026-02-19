package com.dsg.app.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import com.dsg.app.pages.LoginPage
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class Steps {

    @Given("^I am on the login screen$")
    fun iAmOnLoginScreen() {
        LoginPage.verifyLoginScreen()
    }

    @When("^I enter username \"([^\"]*)\"$")
    fun iEnterUsername(username: String) {
        LoginPage.enterUsername(username)
    }

    @And("^I enter password \"([^\"]*)\"$")
    fun iEnterPassword(password: String) {
        LoginPage.enterPassword(password)
    }

    @And("^I tap the login button$")
    fun iTapLoginButton() {
        LoginPage.tapLoginButton()
    }

    @Then("^I should see the home screen$")
    fun iShouldSeeHomeScreen() {
        LoginPage.verifyHomeScreen()
    }

    @Then("^I should see an error message$")
    fun iShouldSeeErrorMessage() {
        LoginPage.verifyErrorMessage()
    }
}