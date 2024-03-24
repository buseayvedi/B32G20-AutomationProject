
@B32G20_140

Feature: Default
  # User Story : As a POS Manager,





    Scenario: US06 As a POS Manager, I should be able to add new products to inventory.
      Given Given user is on "https://qa.twiliaerp.com/web/login" page
      When user enters valid "posmanager6@info.com"
      And user enters valid "posmanager" and click enter
      When user clicks inventory button
      And user clicks Products button on the left side
      And user clicks Create button on top
      Then user types "POCO_2" on the search box
      And user click on the product "POCO_2"
      Then I click on Edit button
      And I click on Save button


#POS_username=posmanager6@info.com
#POS_password=posmanager













   #Given I am on the inventory management page
   #When I add a new product with name "POCO_2"
   #Then "POCO_2" should be added to inventory


