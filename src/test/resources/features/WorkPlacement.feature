@WorkPlacement
Feature: Work Placement

  @ViewWorkPlacement
  Scenario: View Work Placement
    Given user is on the login page
    When user input email "admin1@mail.com"
    And user input password "password"
    And user click sign in
    Then user is on the dashboard

    When user click employee
    And user click work placement
    Then user is on the work placement page