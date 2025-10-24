@ListEmployee
Feature: List Employee

  @ViewListEmployee
  Scenario: View List Employee
    Given user is on the login page
    When user input email "admin1@mail.com"
    And user input password "password"
    And user click sign in
    Then user is on the dashboard

    When user click employee
    And user click list employee
    Then user is on the list employee page