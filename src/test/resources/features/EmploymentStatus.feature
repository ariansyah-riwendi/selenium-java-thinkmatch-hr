@EmploymentStatus
Feature: Employment Status

  @ViewEmploymentStatus
  Scenario: View Employment Status
    Given user is on the login page
    When user input email "admin1@mail.com"
    And user input password "password"
    And user click sign in
    Then user is on the dashboard

    When user click employee
    And user click employment status
    Then user is on the employment status page