Feature: Login

  Scenario: Successful login with valid credentials
    Given I am on the login screen
    When I enter username "testuser"
    And I enter password "password123"
    And I tap the login button
    Then I should see the home screen

  Scenario: Login fails with invalid credentials
    Given I am on the login screen
    When I enter username "wronguser"
    And I enter password "wrongpass"
    And I tap the login button
    Then I should see an error message