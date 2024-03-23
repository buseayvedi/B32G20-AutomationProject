@twiliaerpsalesmanager
Feature: TC02 Sales manager main page menu functions
  US17 As a Sales Manager, I should be able to access the different modules

  @smmainpage
  Scenario Outline: Twiliaerp Menu Options for salesmanager

    Given sales manager is on the login page
    When Twiliaerp sales manager login with "<smloginemail>","<smpassword>"
    Then sales manager should be able to see following modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | CRM             |
      | Sales           |
      | Website         |
      | Point of Sale   |
      | Purchases       |
      | Inventory       |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Maintenance     |

    Then sales manager should be able to click on every module and access the correct module by the title name
      | #Inbox - Odoo                 |
      | Meetings - Odoo               |
      | Notes - Odoo                  |
      | Contacts - Odoo               |
      | Pipeline - Odoo               |
      | Quotations - Odoo             |
      | Dashboard - Odoo              |
      | Point of Sale - Odoo          |
      | Requests for Quotation - Odoo |
      | Inventory - Odoo              |
      | Repair Orders - Odoo          |
      | Customer Invoices - Odoo      |
      | Mass Mailings - Odoo          |
      | Events - Odoo                 |
      | Employees - Odoo              |
      | Leaves Summary - Odoo         |
      | My Expenses to Submit - Odoo  |
      | Maintenance Teams - Odoo      |

    Then sales manager should be able to see More module with following dropdown options

      | Dashboards |
      #| SalesManager    |

    Then sales manager should be able to click on More options module and access the correct module by the title name

      |My Dashboard - Odoo|
    And sales manager should be able to see sales manager account name

    Examples:
      | smloginemail             | smpassword   |
      | salesmanager100@info.com | salesmanager |
      | salesmanager105@info.com | salesmanager |
      | salesmanager90@info.com  | salesmanager |
      | salesmanager95@info.com  | salesmanager |