package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import pages.storePage;
import pages.orderPage;

public class confirmOrderSteps {

	private loginPage loginPage = new loginPage(DriverFactory.getDriver());
	private storePage storePage = new storePage(DriverFactory.getDriver());
	private orderPage orderPage = new orderPage(DriverFactory.getDriver());
	
	@Given("user clicks on Women category")
	public void user_clicks_on_women_category() {
	    loginPage.clickOnWomenCategory();
	}

	@Given("user hover on the product")
	public void user_hover_on_the_product(String string) {
	    storePage.hoverProduct();
	}

	@Given("user clicks on Add to cart button")
	public void user_clicks_on_add_to_cart_button() {
	    storePage.clicAddToCartButton();
	}

	@Given("user clicks proceed to checkout button")
	public void user_clicks_proceed_to_checkout_button() {
	    storePage.clickProceedToCheckOutButton();
	}

	@When("current step should be the first")
	public void current_step_should_be_the_first() {
		orderPage.firstStep();
	}

	@When("user clicks on Proceed to checkout button in Summary step")
	public void user_clicks_on_proceed_to_checkout_button_in_summary_step() {
		orderPage.proceedStandartCheckOutButton();
	}

	@When("current step should be the third")
	public void current_step_should_be_the_third() {
		orderPage.thirdStep();
	}

	@When("user clicks on Proceed to checkout button in Address step")
	public void user_clicks_on_proceed_to_checkout_button_in_address_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("current step should be the fourth")
	public void current_step_should_be_the_fourth() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on checkbox to agree terms of services")
	public void user_clicks_on_checkbox_to_agree_terms_of_services() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Proceed to checkout button in Shipping")
	public void user_clicks_on_proceed_to_checkout_button_in_shipping() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("current step should be the last")
	public void current_step_should_be_the_last() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Pay by bank wire button")
	public void user_clicks_on_pay_by_bank_wire_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on I confirm my order button")
	public void user_clicks_on_i_confirm_my_order_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the order is complete")
	public void the_order_is_complete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
