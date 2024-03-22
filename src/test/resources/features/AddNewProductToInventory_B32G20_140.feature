

@addProduct
Feature: Adding a new product to inventory
  # User Story : As a POS Manager,
  Background:
    Given I am on twiliaerp main page

  Scenario: I should be able to add new products to inventory.
    Given I am logged in as POS Manager
    When I log in as a POS Manager
    Then I should be logged in successfully







   #Given I am on the inventory management page
   #When I add a new product with name "POCO_2"
   #Then "POCO_2" should be added to inventory


