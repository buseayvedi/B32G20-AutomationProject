Feature: TC01 Sales manager should be able to login on the sales manager main page

  US17 As a Sales Manager, I should be able to access the different modules.

  Background:
    Given sales manager is on the login page

  @smlogin
  Scenario Outline: Login as Twiliaerp sales manager
    #Given user is on the login page
    When Twiliaerp sales manager login with "<smloginemail>","<smpassword>"
    Then Twiliaerp sales manager should be able to login

    Examples:
      | smloginemail             | smpassword   |
      | salesmanager100@info.com | salesmanager |
      | salesmanager105@info.com | salesmanager |
      | salesmanager90@info.com  | salesmanager |
      | salesmanager95@info.com  | salesmanager |