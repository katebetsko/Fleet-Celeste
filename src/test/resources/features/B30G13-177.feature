@B30G13-177
Feature: US13 - As a user, I want to manage filters on the Vehicle Cost page
  US13_AC_02 - "As a user I should be able to click on the first checkbox to check all the vehicle costs"

  Background: user is on the login page

		

	#Expected result: user should be able to click on the first checkbox on the Vehicle Costs page to check all the vehicle costs


  @B30G13-172
  Scenario Outline: User (driver) should be able click on the first checkbox to check all the vehicle costs
    Given user login with valid "<username>" and "<password>"
    And   user go on the Vehicle Costs page at the Fleet module
    Then  user should be able click on the first checkbox to check all the vehicle costs

    Examples: valid credentials
      | username | password    |
      | user5    | UserUser123 |
      | user45   | UserUser123 |
      | user155  | UserUser123 |


  @B30G13-173
  Scenario Outline: User (store manager) should be able click on the first checkbox to check all the vehicle costs
    Given user login with valid "<username>" and "<password>"
    And   user go on the Vehicle Costs page at the Fleet module
    Then  user should be able click on the first checkbox to check all the vehicle costs
    Examples: valid credentials
      | username       | password    |
      | storemanager51 | UserUser123 |
      | storemanager69 | UserUser123 |
      | storemanager99 | UserUser123 |


  @B30G13-174
  Scenario Outline: User (sales manager) should be able click on the first checkbox to check all the vehicle costs
    Given user login with valid "<username>" and "<password>"
    And   user go on the Vehicle Costs page at the Fleet module
    Then  user should be able click on the first checkbox to check all the vehicle costs
    Examples: valid credentials
      | username        | password    |
      | salesmanager108 | UserUser123 |
      | salesmanager133 | UserUser123 |
      | salesmanager252 | UserUser123 |
      | salesmanager277 | UserUser123 |