@B32G20-173
Feature: Default

  Scenario: US11 As POS & Sales Manager, I want to manage quotations on the Sales page.
    Given Given user is on "https://qa.twiliaerp.com/web/login" page
    When user enters valid "salesmanager17@info.com"
    And user enters valid "salesmanager" and click enter
    When user click on sales page
    And user check all quotations checkBox
    Then user should be able to select all quotations

#  POS_username=posmanager12@info.com
#  POS_password=posmanager

#  Sale_username=salesmanager17@info.com
#  Sale_password=salesmanager