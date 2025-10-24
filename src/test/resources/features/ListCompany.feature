@ListCompany
Feature: List Company

  @ViewListCompany
  Scenario: View List Company
    Given user is on the login page
    When user input email "admin@admin.com"
    And user input password "12345678"
    And user click sign in
    Then user is on the dashboard

    When user click company
    And user click list company
    Then user is on the list company page
