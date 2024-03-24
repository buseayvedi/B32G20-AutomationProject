
@B32G20_140

Feature: As a POS Manager, I should be able to add new products to inventory.



  Scenario:
    Given user logs in as pos_manager
    When user clicks inventory button
    And user clicks Products button
    And user clicks create button
    And user types test product on name bar
    And user clicks save button
    Then user should see test product on product box
    When user clicks test product button
    And user clicks edit button
    And user types edit product on name bar
    And user clicks save button
    Then user should see edit product on product box


#POS_username=posmanager6@info.com
#POS_password=posmanager













   #Given I am on the inventory management page
   #When I add a new product with name "POCO_2"
   #Then "POCO_2" should be added to inventory


