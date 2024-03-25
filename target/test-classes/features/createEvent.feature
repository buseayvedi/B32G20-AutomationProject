Feature: creation of an event on the calendar
  Agile Story : As a POS Manager, I should be able to create events on my calendar from Calendar module.

  Scenario: Creating an event on the calendar.
  Given user is already logged in to the Twiliaerp application and landed on the discuss page.
    When user go to calendar and clicks on any time box.
    Then user can create an event.

  Scenario: event details verification.
    Given user is already logged in to the Twiliaerp application and landed on the discuss page.
    When user goes to calendar and clicks on created event.
    Then user can see details of created event.