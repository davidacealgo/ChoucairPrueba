@test	
Feature: As user
				 I want to search a product
				 So that I can see the details of the product

	Background: User navigates to home page
		Given I am on home page
		
	Scenario: As guest user I can search products on the search bar
		Given I enter "Blouse" on search bar
		When I click search button
		Then the page returns the product "Blouse"