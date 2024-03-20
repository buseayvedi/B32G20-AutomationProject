@B32G20-159
Feature: Default


  @B32G20-157
  Scenario Outline: AC1:Verify there are 6 columns which shows the details of quotations on the Sales page when the POS & Sales Managers login.
    Given user login successfully with valid credentials "<sheetName>", "<rowNum>"
    And user clicks "title" and land on "pageName" successfully
    When user is on the "Quotations" page
    Then user should see these "titles" on the list
      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |
    Examples:
      | sheetName    | rowNum |
      | posmanager   | 1      |
      | posmanager   | 55     |
      | salesmanager | 2      |
      | salesmanager | 65     |


  @B32G20-158
  Scenario Outline: AC2: Verify user can see the result on the list when searching with Quotation Number data.
    Given user login successfully with valid credentials "<sheetName>", "<rowNum>"
    And user clicks "title" and land on "pageName" successfully
    When user enters "<searchNumber>" in the search box and hit the enter key
    Then user should see the result on the list : ("<eQuotationNumber>","<eQuotationDate>","<eCustomer>","<eSalesperson>","<eTotal>","<eStatus>"

    Examples:
      | sheetName    | rowNum | searchNumber | eQuotationNumber | eQuotationDate      | eCustomer | eSalesperson    | eTotal | eStatus     |
      | posmanager   | 1      | SO811        | SO811            | 06/19/2019 15:55:12 | Al banana | EventsCRM_User3 | $ 1.00 | Sales Order |
      | posmanager   | 55     | SO056        | SO056            | 01/21/2019 00:50:20 | POSUser2  |                 | $ 4.18 | Quotation   |
      | salesmanager | 2      | SO811        | SO811            | 06/19/2019 15:55:12 | Al banana | EventsCRM_User3 | $ 1.00 | Sales Order |
      | salesmanager | 65     | SO056        | SO056            | 01/21/2019 00:50:20 | POSUser2  |                 | $ 4.18 | Quotation   |