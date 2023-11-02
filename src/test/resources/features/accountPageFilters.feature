Feature: As a user, I want to filter customers’ info on the Account page.
  Background: User should already be logged in
    Given the user is on the login page
    And the user logged in as "<userType>"
    And the user logged in with username as "User1" and password as "UserUser123"


  Scenario: users should see 8 filter items on the Accounts page
    Given the user is in the accounts page



#    AC1: users should see 8 filter items on the Accounts page
#
#Expected filter names:  Account Name, Contact Name, Contact Email,
# Contact Phone, Owner,  Business Unit, Created At, Updated At
