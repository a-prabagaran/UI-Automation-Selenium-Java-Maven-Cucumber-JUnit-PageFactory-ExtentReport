Feature: automationpractice.com

Background: 
	Given launch the browser
	When login with valid credentials

Scenario: Order T-Shirt and Verify in Order History
	Then order T-Shirt
	And verify the T-Shirt ordered in order history

Scenario: Update Personal Information (First Name) in My Account
	Then update First Name
	And verify the updated First Name
		