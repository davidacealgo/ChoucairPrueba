#Author: davidacealgo
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

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
		| firstName | lastName | password | address | city | zip | mobilephone           |
		| Sara | Elizabeth | choucair123 | 450 Serra Mall | Stanford | 94305 | 6507232300|