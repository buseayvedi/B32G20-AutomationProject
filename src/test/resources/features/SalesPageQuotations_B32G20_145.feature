@B32G20-173
Feature: Default

  Scenario: US11 As POS & Sales Manager, I want to manage quotations on the Sales page.
    Given "manager" manager logged-in
    When POS click on sales page
    And POS select quotations from side bar
    Then POS should be able to select all quotations by clicking the Quotation number check box
