@B30G13-176
Feature: US13 - As a user, I want to manage filters on the Vehicle Cost page
	     AC_01- user should be able to see 3 columns on the Vehicle Costs page.

	    #Expected column names: "TYPE, TOTAL PRICE, DATE"

	Background: user is on the login page


		

	@B30G13-169
	Scenario: Verify that user (driver) able to see 3 columns on the Vehicle Costs page: Type, Total Price, Date
		Given user login with a driver credentials
		    And   user go on the Vehicle Costs page at the Fleet module
		    Then  user should be able to see following columns:
		      |TYPE|
		      |TOTAL PRICE|
		      |DATE|	


	@B30G13-170
	Scenario: Verify that user (sales manager) able to see 3 columns on the Vehicle Costs page: Type, Total Price, Date
		Given user login with a sales manager credentials
		    And   user go on the Vehicle Costs page at the Fleet module
		    Then  user should be able to see following columns:
		      |TYPE|
		      |TOTAL PRICE|
		      |DATE|	


	@B30G13-171
	Scenario: Verify that user (store manager) able to see 3 columns on the Vehicle Costs page: Type, Total Price, Date
		Given user login with a store manager credentials
		    And   user go on the Vehicle Costs page at the Fleet module
		    Then  user should be able to see following columns:
		      |TYPE|
		      |TOTAL PRICE|
		      |DATE|