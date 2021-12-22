Feature: As guest user
				 I want to login 
				 So that the system can authenticate me

@test
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

@test
Scenario: Login with correct credentials
Given user is on login page
When user enters username "prueba1@mailinator.com"
And user enters password "fresacoco15"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"