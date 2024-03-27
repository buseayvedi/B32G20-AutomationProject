@main
Feature: main modules functionalities.
  Agile Story: As a POS Manager, I should be able to access the main modules.


  Scenario: Menu Options for posmanager
    When user logged in to the Twiliaerp application with posmanager credentials
    Then user should land on Discuss page and has access to the following modules.
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | CRM           |
      | Sales         |
      | Website       |
      | Point of Sale |
      | Purchases     |
      | Inventory     |
      | Manufacturing |
      | Repairs       |
      | Project       |
      | Events        |
      | Surveys       |
      | Employees     |
      | Attendances   |
      | Leaves        |
      | Expenses      |
      | Maintenance   |
      | Fleet         |
      | Dashboards    |