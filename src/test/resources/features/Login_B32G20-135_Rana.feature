@B32G20-170
Feature: Default

  Background: User is on the login page of the application
    Given user is on the "https://qa.twiliaerp.com/web/login" page

  @B32G20-166 @Login
  Scenario: US01_Verify that the user can log in with valid credentials
    When When user enters valid "posmanager12@info.com"
    And user enters valid "posmanager" then click enter
    Then user should see the dashboard

#      | username                    | password         |
#      | posmanager12@info.com       | posmanager       |
#      | eventscrmmanager11@info.com | eventscrmmanager |
#      | salesmanager17@info.com     | salesmanager     |
#      | imm37@info.com              | inventorymanager |
#      | expensesmanager77@info.com  | expensesmanager  |


  @B32G20-167 @InvalidUsername
  Scenario Outline: US01_Verify that the user cannot log in with invalid username credentials
    When user enters invalid "<username>" and valid "<password>"
    Then verify "<message>" message displayed
    Examples:
      | username                    | password         | message              |
      | posmanager12@info.com       | inventorymanager | Wrong login/password |
      | eventscrmmanager11@info.com | salesmanager     | Wrong login/password |


  @B32G20-168 @InvalidPassword
  Scenario Outline: US01_Verify that the user cannot log in with invalid password credentials
    When user enters valid "<username>" and invalid "<password>"
    Then verify "<message>" message displayed
    Examples:
      | username                   | password         | message              |
      | posmanager12@info.com      | inventorymanager | Wrong login/password |
      | expensesmanager77@info.com | salesmanager     | Wrong login/password |


  @B32G20-169 @BlankFieldVerification
  Scenario: US01_Verify user gets "Please fill out this filed" message for blank fields
    When user gets “Please fill out this field” for blank fields