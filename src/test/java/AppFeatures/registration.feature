Feature: Register user

	Background: User navigates to home page
		Given I am on home page
		
	Scenario Outline: As guest user I can create a new account
		Given I click Sign in button
		And I enter email address in create account form
		And I click Create an account button
		And I enter first name as "<firstName>"
 		And I enter last name as "<lastName>"
 		And I enter password as "<password>"
 		And I enter address as "<address>"
 		And I enter city as "<city>"
 		And I select state
 		And I enter Postal code as "<zip>"
 		And I enter mobile phone as "<mobilePhone>"
 		When I click the button Register
 		Then I am navigated to My account page
 		And I see my account information
	Examples:
		| firstName | lastName | password | address | city | zip | mobilePhone |
		| Sara | Elizabeth | choucair123 | 450 Serra Mall | Stanford | 94305 | 6507232300|