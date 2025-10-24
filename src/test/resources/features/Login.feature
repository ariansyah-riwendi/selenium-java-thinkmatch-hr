@Login
Feature: Login

  @LoginSuccessfully
  Scenario: Login Successfully
    Given user is on the login page
    When user input email "admin1@mail.com"
    And user input password "password"
    And user click sign in
    Then user is on the dashboard