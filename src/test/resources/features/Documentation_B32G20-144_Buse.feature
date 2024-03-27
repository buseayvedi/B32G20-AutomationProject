@buse
Feature: Documentation Page functionality
  US: US10 As a user, I should be able to access the documentation page.
  Acceptance Criteria:
  1. Verify the “Odoo Documentation” message is displayed in a new window after clicking Documentation button in the profile menu.
  2. Verify that 4 main document topics (User Docs, Install and Maintain, Developer, Contribute) are listed in Odoo Documentation.


@buse1
  Scenario Outline: AC1: Verify the “Odoo Documentation” message is displayed in a new window after clicking Documentation button in the profile menu.
    Given user login successfully with valid credentials "<sheetName>", <rowNum>
    And user click account name tab
    When user clicks "Documentation" button
    And user lands on "Odoo Documentation" page
    Then user should see "Odoo Documentation" message in a new window

    Examples:
      | sheetName        | rowNum |
      | posmanager       | 5      |
      | crmmanager       | 20     |
      | salesmanager     | 2      |
      | inventorymanager | 65     |
      | expensesmanager  | 50     |


  @buse2
  Scenario Outline: AC2: Verify that 4 main document topics (User Docs, Install and Maintain, Developer, Contribute) are listed in Odoo Documentation.
    Given user login successfully with valid credentials "<sheetName>", <rowNum>
    And user click account name tab
    When user clicks "Documentation" button
    And user lands on "Odoo Documentation" page
    Then user should see these main document topics
      | User Docs            |
      | Install and Maintain |
      | Developer            |
      | Contributing          |

    Examples:
      | sheetName        | rowNum |
      | posmanager       | 5      |
      | crmmanager       | 20     |
      | salesmanager     | 2      |
      | inventorymanager | 65     |
      | expensesmanager  | 50     |