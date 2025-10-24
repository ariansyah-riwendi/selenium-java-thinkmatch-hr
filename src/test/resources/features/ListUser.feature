@ListUser
Feature: List User

  @ViewListUser
  Scenario: View List User
    Given user is on the login page
    When user input email "admin@admin.com"
    And user input password "12345678"
    And user click sign in
    Then user is on the dashboard

    When user click company
    And user click list user
    Then user is on the list user page
