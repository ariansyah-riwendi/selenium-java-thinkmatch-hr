@Login
Feature: Login

  @LoginSuccessfully
  Scenario: Login Successfully
    Given user is on the login page
    When user input username "Admin"
    And user input password "admin123"
    And user click login
    Then user is on the dashboard