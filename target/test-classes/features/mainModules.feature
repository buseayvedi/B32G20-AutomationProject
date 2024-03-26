@main
Feature: main modules functionalities.
  Agile Story: As a POS Manager, I should be able to access the main modules.

  Scenario:  Verify the POS managers access to 22 modules.
    When user logged in to the Twiliaerp application.
    Then user should land on Discuss page and has access to 22 main modules.
