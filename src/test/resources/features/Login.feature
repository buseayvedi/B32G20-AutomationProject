@login
Feature: As a user, I should be able to login

  Background: User is on the login page of the application
    Given user is on the login page

  Scenario Outline: verify login with valid credentials
    When user enters valid "<username>"
    And user enters valid "<password>" and click enter
    Then user should see the dashboard
    Examples:
      | username                    | password         |
      | posmanager12@info.com       | posmanager       |
      | eventscrmmanager11@info.com | eventscrmmanager |
      | salesmanager17@info.com     | salesmanager     |
      | imm37@info.com              | inventorymanager |
      | expensesmanager77@info.com  | expensesmanager  |


  Scenario Outline: verify user fails to log in with invalid credentials
    Given user is on the login page
    When user enters invalid "<username>" and "<password>"
    Then verify "<message>" message displayed
    Examples:
      | username              | password      | message              |
      | posmanager12@info.com | wrongPassword | Wrong login/password |
      | wrongUsername         | salesmanager  | Wrong login/password |

