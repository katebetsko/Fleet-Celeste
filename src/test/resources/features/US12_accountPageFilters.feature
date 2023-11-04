@US12_sulaiman
Feature: As a user, I want to filter customers’ info on the Account page.

  Background: User should already be logged in
    And user logs in with a "storemanager" account

  Scenario: users should see 8 filter items on the Accounts page
    Given the user is in the accounts page SH
    Then user should see these eight filter items on the Accounts page SH
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |

#AC1: users should see 8 filter items on the Accounts page
#Expected filter names:
  # Account Name,
  # Contact Name,
  # Contact Email,
  # Contact Phone,
  # Owner,
  # Business Unit,
  # Created At,
  # Updated At