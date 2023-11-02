Feature: Vehicle Page
  US06: As a user, I want to see edit car info icons from the Vehicle page.
@US06
  Scenario: Users should see “view, edit, delete” when they hover the mouse over the 3 dots “…”
    Given User is already on the Login Page
    Then User Enters "storemanager51" and "UserUser123" Credentials for Store Manager

    When User hovers over the Fleet menu
    And User selects Vehicle page from the Fleet menu dropdown
    Given User hovers over the ... dots and should be able to see “view, edit, delete” options




