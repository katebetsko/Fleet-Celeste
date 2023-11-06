@US4
Feature: Vehicle contracts page
  User story #4: As a user, I want to access to Vehicle contracts page

  @B30G13-178
  Scenario Outline: Verify Store managers and Sales managers are able to access the Vehicle contracts page
    Given the user logged in with username as "<username>" and password as "<password>"
    When user sees Dashboard page -KB
    And user hovers over Fleet option -KB
    And user presses Vehicle contracts option under Fleet option -KB
    Then user should see Vehicle contracts page -KB
    Examples:
      | username        | password    |
      | storemanager77  | UserUser123 |
      | salesmanager125 | UserUser123 |

  @B30G13-180
  Scenario: Verify Drivers are NOT able to access the Vehicle contracts page,
  and the app should display “You do not have permission to perform this action.”
    Given the user logged in with username as "user1" and password as "UserUser123"
    When user sees Dashboard page -KB
    And user hovers over Fleet option -KB
    And user presses Vehicle contracts option under Fleet option -KB
    Then user sees “You do not have permission to perform this action.”	error message -KB