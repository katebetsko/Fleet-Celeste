@US4
Feature: Vehicle contracts page
  User story #4: As a user, I want to access to Vehicle contracts page

  Background: User is already on the login page
    Given the user is on the Transmuda login page -KB

  @B30G13-178
  Scenario Outline: Verify Store managers are able to access the Vehicle contracts page
    When user enters valid "<username>" and "<password>" -KB
    And user presses LOG IN button -KB
    And user sees Dashboard page -KB
    And user hovers over Fleet option -KB
    And user presses Vehicle contracts option under Fleet option -KB
    Then user should see Vehicle contacts page -KB
    Examples:
      | username        | password    |
      | storemanager77  | UserUser123 |
      | storemanager99  | UserUser123 |
      | storemanager225 | UserUser123 |

  @B30G13-179
  Scenario Outline: Verify Sales managers are able to access the Vehicle contracts page
    When user enters valid "<username>" and "<password>" -KB
    And user presses LOG IN button -KB
    And user sees Dashboard page -KB
    And user hovers over Fleet option -KB
    And user presses Vehicle contracts option under Fleet option -KB
    Then user should see Vehicle contacts page -KB
    Examples:
      | username        | password    |
      | salesmanager125 | UserUser123 |
      | salesmanager149 | UserUser123 |
      | salesmanager297 | UserUser123 |

  @B30G13-180
  Scenario Outline: Verify Drivers are NOT able to access the Vehicle contracts page,
  and the app should display “You do not have permission to perform this action.”
    When user enters valid "<username>" and "<password>" -KB
    And user presses LOG IN button -KB
    And user sees Dashboard page -KB
    And user hovers over Fleet option -KB
    And user presses Vehicle contracts option under Fleet option -KB
    Then user sees “You do not have permission to perform this action.”	error message -KB
    Examples:
      | username | password    |
      | user5    | UserUser123 |
      | user47   | UserUser123 |
      | user177  | UserUser123 |