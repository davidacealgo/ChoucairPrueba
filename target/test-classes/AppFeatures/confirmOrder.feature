@test
Feature: Confirm order

Background: User login 
	Given user is on login page
	When user enters username "prueba1@mailinator.com"
	And user enters password "fresacoco15"
	And user clicks on Login button
	Then user gets the title of the page
	And page title should be "My account - My Store"
	And user clicks on Women category
	And page title should be "Women - My Store"
	

	Scenario: Buy a product
		Given user hover on the product
		And user clicks on Add to cart button
		And user clicks proceed to checkout button
		When current step should be the first
		And user clicks on Proceed to checkout button in Summary step
		And current step should be the third
		And user clicks on Proceed to checkout button in Address step 
		And current step should be the fourth
		And user clicks on checkbox to agree terms of services
		And user clicks on Proceed to checkout button in Shipping
		And current step should be the last
		And user clicks on Pay by bank wire button
		And user clicks on I confirm my order button
		Then the order is complete