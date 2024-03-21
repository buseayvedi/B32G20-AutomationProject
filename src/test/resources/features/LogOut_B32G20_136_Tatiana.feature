@logout
Feature: Log out functionality
  US:
  As a user, I should be able to log out.
  Acceptance Criteria:
  1. Verify the user logs out by clicking “Log out” button in profile menu and lands on Log in page.
  2. Verify that the user can see 5 options under the profile name.
  (Documentation, Support, Preferences, My Odoo.com account, Log out)

  Scenario Outline: AC1: Verify the user logs out by clicking “Log out” button in profile menu and lands on Log in page.
    Given user login successfully with valid credentials "<sheetName>", <rowNum>
    When user click account name tab
    And user click log out button
    Then user should lands on log in page again
    Examples:
      | sheetName    | rowNum |
      | posmanager   | 5      |
      | posmanager   | 55     |

