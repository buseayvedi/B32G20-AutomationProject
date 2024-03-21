@login
Feature: login feature

  Scenario: User is on the login page of the application
    Given the user is on the login page
    When user enters valid username
    And user enters valid password and press enter
    Then user should see the dashboard
