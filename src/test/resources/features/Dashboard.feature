@Dashboard
Feature: Dashboard

  @ViewDashboard
  Scenario: View Dashboard
    Given user is on the login page
    When user input email "admin1@mail.com"
    And user input password "password"
    And user click sign in
    Then user is on the dashboard

    When user click web logo
    Then user is on the dashboard
