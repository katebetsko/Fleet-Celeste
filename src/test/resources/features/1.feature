@B30G13-186
Feature: Default

	#{color:#de350b}{*}User Story{*}:{color}  As a user, I want to see edit car info icons from the Vehicle page.
	#
	#{color:#de350b}*AC #1:*  {color}users should see “{*}view, edit, delete{*}” when they hover the mouse over the 3 dots “…” 
	@B30G13-185
	Scenario: US06 AC1: “View, Edit, Delete” icons should be visible while hovering on 3 dots
		Given User is already on the Login Page
		Then User Enters "storemanager51" and "UserUser123" Credentials for Store Manager
		When User hovers over the Fleet menu
		And User selects Vehicle page from the Fleet menu dropdown
		Given User hovers over the ... dots and should be able to see “view, edit, delete” options