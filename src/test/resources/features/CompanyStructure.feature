@CompanyStructure
Feature: Company Structure

  @ViewCompanyStructure
  Scenario: View Company Structure
    Given user is on the login page
    When user input email "admin1@mail.com"
    And user input password "password"
    And user click sign in
    Then user is on the dashboard

    When user click employee
    And user click company structure
    Then user is on the company structure page