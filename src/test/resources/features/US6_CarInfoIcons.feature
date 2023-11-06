@US06
Feature: Vehicle Page
  US06: As a user, I want to see edit car info icons from the Vehicle page.


 Scenario Outline: Users should see “view, edit, delete” when they hover the mouse over the 3 dots “…”
    Given User is already on the Login Page
    Then User Enters "<username>" and "<password>" Credentials
    When User hovers over the Fleet menu
    And User selects Vehicle page from the Fleet menu dropdown
    Given User hovers over the ... dots and should be able to see “view, edit, delete” options

   Examples:
     | username        | password    |
     | storemanager51  | UserUser123 |
     | storemanager100 | UserUser123 |
     | storemanager101 | UserUser123 |

  Scenario Outline: Users should see “view, edit, delete” when they hover the mouse over the 3 dots “…”
    Given User is already on the Login Page
    Then User Enters "<username>" and "<password>" Credentials
    When User hovers over the Fleet menu
    And User selects Vehicle page from the Fleet menu dropdown
    Given User hovers over the ... dots and should be able to see “view, edit, delete” options

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | salesmanager120 | UserUser123 |





