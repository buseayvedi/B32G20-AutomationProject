@B32G20-165 @buse
Feature: Default

	#*{color:#DE350B}*US08 *{color}*
	#As a POS & sales manager, I should be able to access the Repairs page.
	#*{color:#DE350B}*  Acceptance Criteria:*{color}*
	#  +1. Verify there are 6 columns to show the details of the repair orders on the Repairs page when the POS & Sales Managers login.+
	#  2. Verify user can see the result on the list when searching with Repair Reference data.
  @B32G20-163
  Scenario Outline: AC1:Verify there are 6 columns to show the details of the repair orders on the Repairs page when
    Given user login successfully with valid credentials "<sheetName>", <rowNum>
    When user clicks Repairs title and land on the page successfully
    Then user verify there are these columns to show the detail of the repair orders on the page
      | Repair Reference    |
      | Product to Repair   |
      | Customer            |
      | Delivery Address    |
      | Warranty Expiration |
      | Status              |


    Examples:
      | sheetName    | rowNum |
      | posmanager   | 5      |
      | posmanager   | 55     |
      | salesmanager | 2      |
      | salesmanager | 65     |

	#*{color:#DE350B} US08 {color}*
	#As a POS & sales manager, I should be able to access the Repairs page.
	#*{color:#DE350B}* {color:#DE350B}* Acceptance Criteria:*{color}*{color}*
	#  1. Verify there are 6 columns to show the details of the repair orders on the Repairs page when the POS & Sales Managers login.
	#  +2. Verify user can see the result on the list when searching with Repair Reference data.+
  @B32G20-164
  Scenario Outline: AC2: Verify user can see the result on the list when searching with Repair Reference data.
    Given user login successfully with valid credentials "<sheetName>", <rowNum>
    When user clicks Repairs title and land on the page successfully
    When user enters "<searchRepairReference>" in the search box on the Repairs page and hit the enter key
    Then user should see the result on the Repair Order list : "<eRepairReference>","<eProductToRepair>","<eCustomer>","<eDeliveryAddress>","<eWarrantyExpiration>","<eStatus>"

    Examples:
      | sheetName    | rowNum | searchRepairReference | eRepairReference | eProductToRepair | eCustomer             | eDeliveryAddress        | eWarrantyExpiration | eStatus         |
      | posmanager   | 5      | RN                    | RN               | iPhone X         | ASUSTeK, James Miller | ASUSTeK, Peter Mitchell |                     | Ready to Repair |
      | posmanager   | 55     | RMA/00302             | RMA/00302        | iPhone X         |                       |                         |                     | Confirmed       |
      | salesmanager | 2      | RN                    | RN               | iPhone X         | ASUSTeK, James Miller | ASUSTeK, Peter Mitchell |                     | Ready to Repair |
      | salesmanager | 65     | RMA/00302             | RMA/00302        | iPhone X         |                       |                         |                     | Confirmed       |