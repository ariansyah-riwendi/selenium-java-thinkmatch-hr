@Dashboard
Feature: Dashboard

  @ViewDashboard
  Scenario: View Dashboard
    Given user is on the login page
    When user input email "admin@admin.com"
    And user input password "12345678"
    And user click sign in
    Then user is on the dashboard

    When user click web logo
    Then user is on the dashboard
