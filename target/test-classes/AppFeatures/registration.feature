Feature: Register user
	In order to create a new account
	As guest user
	I want to fill the form registration

	Background: User navigates to home page
		Given I am on home page
	
	@test
	Scenario Outline: As guest user I can create a new account
		Given I click Sign in button
		When I enter email address in create account form
		And I click Create an account button
		And I enter first name as "<firstName>"
 		And I enter last name as "<lastName>"
 		And I enter password as "<password>"
 		And I enter address as "<address>"
 		And I enter city as "<city>"
 		And I select state
 		And I enter Postal code as 94305
 		And I enter mobile phone as "65072323"
 		When I click the button Register
 		Then user gets title of the page
 		And page title is "My account - My Store"
	Examples:
		| firstName | lastName | password | address | city |
		| Sara | Elizabeth | choucair123 | 450 Serra Mall | Stanford |
		
	@test	
	Scenario: As guest user I can not create a new account with an existing email
		Given I click Sign in button
		When I enter email address "prueba1@mailinator.com"
		And I click Create an account button
		Then An error is displayed 