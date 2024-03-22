Feature: creation of an event on the calendar
  Agile Story : As a POS Manager, I should be able to create events on my calendar from Calendar module.

  Background: For all scenarios user is on the discuss page of the Twiliaerp application.
    Given user is on the login page of the Twiliaerp application.
    When user enters the POS Manager username and password.
    Then user should be able to login and land on the Discuss page.

  Scenario: Creating an event on the calendar.

    When user go to calendar and clicks on any time box.
    Then user can create an event.

  Scenario: event details verification.

    When user goes to calendar and clicks on created event.
    Then user can see details of created event.