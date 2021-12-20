package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerSteps{
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
	    System.out.println("Step 1");
	}

	@Given("I click Sign in button")
	public void i_click_sign_in_button() {
	    System.out.println("Step 2");
	}

	@Given("I enter email address in create account form")
	public void i_enter_email_address_in_create_account_form() {
	    System.out.println("Step 3");
	}

	@Given("I click Create an account button")
	public void i_click_create_an_account_button() {
	    System.out.println("Step 4");
	}

	@Given("I enter first name as {string}")
	public void i_enter_first_name_as(String firstName) {
	    System.out.println("Step 5" + firstName);
	}

	@Given("I enter last name as {string}")
	public void i_enter_last_name_as(String lastName) {
	    System.out.println("Step 6"+lastName);
	}

	@Given("I enter password as {string}")
	public void i_enter_password_as(String password) {
	    System.out.println("Step 7"+password);
	}

	@Given("I enter address as {string}")
	public void i_enter_address_as(String address) {
	    System.out.println("Step 8"+address);
	}

	@Given("I enter city as {string}")
	public void i_enter_city_as(String city) {
	    System.out.println("Step 9"+city);
	}

	@Given("I select state")
	public void i_select_state() {
	    System.out.println("Step 10");
	}

	@Given("I enter Postal code as {string}")
	public void i_enter_postal_code_as(String zip) {
	    System.out.println("Step 11"+zip);
	}

	@Given("I enter mobile phone as {string}")
	public void i_enter_mobile_phone_as(String mobilePhone) {
	    System.out.println("Step 12"+mobilePhone);
	}

	@When("I click the button Register")
	public void i_click_the_button_register() {
	    System.out.println("Step 13");
	}

	@Then("I am navigated to My account page")
	public void i_am_navigated_to_my_account_page() {
	    System.out.println("Step 14");
	}

	@Then("I see my account information")
	public void i_see_my_account_information() {
	    System.out.println("Step 15");
	}
}
