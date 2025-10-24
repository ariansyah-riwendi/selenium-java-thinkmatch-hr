@SuperPortalUser
Feature: Super Portal User

  @ViewSuperPortalUser
  Scenario: View Super Portal User
    Given user is on the login page
    When user input email "admin@admin.com"
    And user input password "12345678"
    And user click sign in
    Then user is on the dashboard

    When user click super portal user
    Then user is on the super portal user page
