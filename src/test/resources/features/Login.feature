Feature: Login feature

  Scenario: As a user, I should be able to log in
    Given User is on the login page of the application
    When user enters valid {username} and {password}
    Then user should see the dashboard