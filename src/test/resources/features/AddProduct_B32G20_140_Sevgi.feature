
@B32G20_140

Feature: Default
  # User Story : As a POS Manager,





    Scenario: US06 As a POS Manager, I should be able to add new products to inventory.
      Given Given user is on "https://qa.twiliaerp.com/web/login" page
      When user enters valid "posmanager6@info.com"
      And user enters valid "posmanager" and click enter
      When user clicks inventory link
      And user clicks Products link
      And user clicks Create button
      Then user types "POCO_2" on the product name bar
      And user clicks Save button
      Then user click on Products link
      Then user click on Edit button
      And user click on Save button


#POS_username=posmanager6@info.com
#POS_password=posmanager













   #Given I am on the inventory management page
   #When I add a new product with name "POCO_2"
   #Then "POCO_2" should be added to inventory


