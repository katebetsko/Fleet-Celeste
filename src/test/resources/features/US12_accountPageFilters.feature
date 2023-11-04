@US12_sulaiman
Feature: As a user, I want to filter customers’ info on the Account page.


  Scenario Outline: users should see 8 filter items on the Accounts page
    Given user logs in with a "<User>" account
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

    Examples: User Types
      | User         |
      | driver       |
      | salesmanager |
      | storemanager |


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
