@Login
Feature: Login

  @LoginSuccessfully
  Scenario: Login Successfully
    Given user is on the login page
    When user input email "admin@admin.com"
    And user input password "12345678"
    And user click sign in
    Then user is on the dashboard