package com.dsg.app.steps

import com.dsg.app.pages.*
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class SignInSteps {
    @Given("Launch DSG Application")
    fun launchApp() {}
    @Then("user should see user is on Dicks Sporting Goods application landing screen")
    fun verifyLandingScreen() { LandingPage().verifyLandingScreen() }
    @When("user tap on sign in button in DSG application")
    fun tapSignInButton() { LandingPage().tapSignIn() }
    @Then("user should be navigated to sign in page in DSG application")
    fun verifySignInPage() { SignInPage().verifySignInScreen() }
    @When("user made a successful sign in after enter a valid username and password in DS")
    fun enterCredentials() { SignInPage().enterCredentials("testuser", "password123") }
    @And("user tap on signIn button in Sign In screen in DSG application")
    fun tapSignInOnSignInScreen() { SignInPage().tapSignIn() }
    @And("user should see the location services screen in DSG application")
    fun verifyLocationScreen() { LocationServicesPage().verifyLocationScreen() }
    @And("user tap on next button and allow location in DSG application")
    fun allowLocation() { LocationServicesPage().allowLocation() }
    @And("user should see the notification services screen in DSG application")
    fun verifyNotificationScreen() { NotificationServicesPage().verifyNotificationScreen() }
    @And("user tap on next button in notification screen in DSG application")
    fun tapNextNotification() { NotificationServicesPage().tapNext() }
    @Then("user should be navigated to home screen in DSG application")
    fun verifyHomeScreen() { HomePage().verifyHomeScreen() }
    @And("user is able to see sign in user home screen in DSG application")
    fun verifySignedInHomeScreen() { HomePage().verifySignedInUser() }
}