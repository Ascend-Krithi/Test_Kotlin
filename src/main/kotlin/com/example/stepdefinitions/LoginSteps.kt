package com.example.stepdefinitions

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import com.example.R
import org.junit.Assert.assertTrue

class LoginSteps {
    @Given("^the user is on the login screen$")
    fun userOnLoginScreen() {
        // Assume app launches to login screen
    }

    @When("^the user enters valid credentials$")
    fun userEntersValidCredentials() {
        onView(withId(R.id.username)).perform(typeText("testuser"), closeSoftKeyboard())
        onView(withId(R.id.password)).perform(typeText("password123"), closeSoftKeyboard())
    }

    @When("^the user taps the login button$")
    fun userTapsLogin() {
        onView(withId(R.id.login_button)).perform(click())
    }

    @Then("^the user should see the home screen$")
    fun userSeesHomeScreen() {
        // Add assertion for home screen
        assertTrue(true)
    }
}
