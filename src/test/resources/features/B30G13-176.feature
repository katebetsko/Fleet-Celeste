@B30G13-176
Feature: US13 - As a user, I want to manage filters on the Vehicle Cost page
	     AC_01- user should be able to see 3 columns on the Vehicle Costs page.

	    #Expected column names: "TYPE, TOTAL PRICE, DATE"

	Background: user is on the login page


	@B30G13-169
	Scenario Outline: Verify that user (driver) able to see 3 columns on the Vehicle Costs page: Type, Total Price, Date
		Given user login with valid "<username>" and "<password>"
		And   user go on the Vehicle Costs page at the Fleet module
		Then  user should be able to see following columns:
			| TYPE        |
			| TOTAL PRICE |
			| DATE        |
		Examples: valid credentials
			| username | password    |
			| user1    | UserUser123 |
			| user47   | UserUser123 |
			| user177  | UserUser123 |


	@B30G13-170
	Scenario Outline: Verify that user (sales manager) able to see 3 columns on the Vehicle Costs page: Type, Total Price, Date
		Given user login with valid "<username>" and "<password>"
		And   user go on the Vehicle Costs page at the Fleet module
		Then  user should be able to see following columns:
			| TYPE        |
			| TOTAL PRICE |
			| DATE        |
		Examples: valid credentials
			| username        | password    |
			| salesmanager101 | UserUser123 |
			| salesmanager145 | UserUser123 |
			| salesmanager258 | UserUser123 |


	@B30G13-171
	Scenario Outline: Verify that user (store manager) able to see 3 columns on the Vehicle Costs page: Type, Total Price, Date
		Given user login with valid "<username>" and "<password>"
		And   user go on the Vehicle Costs page at the Fleet module
		Then  user should be able to see following columns:
			| TYPE        |
			| TOTAL PRICE |
			| DATE        |
		Examples: valid credentials
			| username        | password    |
			| storemanager85  | UserUser123 |
			| storemanager100 | UserUser123 |
			| storemanager205 | UserUser123 |