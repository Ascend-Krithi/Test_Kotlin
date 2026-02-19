package com.dsg.app.steps

import com.dsg.app.pages.*
import io.cucumber.java.en.And
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class PaymentSteps {
    @When("user made a successful sign in after enter a valid username and password in DSG 5BX application")
    fun enterCredentials() { SignInPage().enterCredentials("testuser", "password123") }
    @And("user tap on signin button in Sign In screen in DSG SBX application")
    fun tapSignIn() { SignInPage().tapSignIn() }
    @When("user enters product keyword in search box In DSG application")
    fun enterProductKeyword() { HomePage().searchProduct("shoes") }
    @Then("tap on View All button in DSG application")
    fun tapViewAll() { HomePage().tapViewAll() }
    @Then("user should be redirected to product listing screen In DSG application")
    fun verifyProductListing() { ProductListingPage().verifyListingScreen() }
    @When("user tap on any product from the listing screen in DSG application")
    fun tapProduct() { ProductListingPage().tapAnyProduct() }
    @Then("user should be landing to product details page in DSG application S0X")
    fun verifyProductDetails() { ProductDetailsPage().verifyProductDetailsScreen() }
    @When("user should add all attribute value in DSG application")
    fun addAttributes() { ProductDetailsPage().addAllAttributes() }
    @Then("user tap on add to cart button on PDP screen in DSG application 5BX")
    fun tapAddToCart() { ProductDetailsPage().tapAddToCart() }
    @And("user tap on View Cart button in the modal in DSG application")
    fun tapViewCart() { ProductDetailsPage().tapViewCart() }
    @Then("user should be displayed with the title CART with the Cart ID in DSG application")
    fun verifyCartScreen() { CartPage().verifyCartScreen() }
    @When("user tap on Checkout button in the modal in DSG application")
    fun tapCheckout() { CartPage().tapCheckout() }
    @And("user validate checkout screen in DSG application")
    fun validateCheckoutScreen() { CheckoutPage().verifyCheckoutScreen() }
    @And("user tap on ContinueToPayment button In DSG application")
    fun tapContinueToPayment() { CheckoutPage().tapContinueToPayment() }
    @And("user tap on Payment Method section in DSG application")
    fun tapPaymentMethod() { PaymentPage().tapPaymentMethod() }
    @When("user tap on Credit Card Information section in DSG application")
    fun tapCreditCardInfo() { PaymentPage().tapCreditCardInfo() }
    @Then("user should see the Credit Card Information screen with below section/fields in DSG application")
    fun verifyCreditCardScreen() { PaymentPage().verifyCreditCardScreen() }
    @And("user should be allowed to enter CC details cardno, expdate and cvv manually in DSG application")
    fun enterCCDetails() { PaymentPage().enterCreditCardDetails("4111111111111111", "12/25", "123") }
    @And("user tap Save button in DSG application")
    fun tapSave() { PaymentPage().tapSave() }
    @And("user should be navigated to the Checkout screen in DSG application")
    fun verifyCheckoutScreenAfterPayment() { CheckoutPage().verifyCheckoutScreen() }
    @Then("user should see PLACE ORDER button enabled in DSG application")
    fun verifyPlaceOrderEnabled() { CheckoutPage().verifyPlaceOrderEnabled() }
    @And("user tap on Place Order button in DS6 application")
    fun tapPlaceOrder() { CheckoutPage().tapPlaceOrder() }
    @And("user order should be processed and should displayed the Order Confirmation Screen with payment Method in DSG SBX application")
    fun verifyOrderConfirmation() { CheckoutPage().verifyOrderConfirmation() }
}