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
	public void user_hover_on_the_product() {
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

	@When("current step is the first should be {string}")
	public void current_step_is_the_first_should_be(String step) {
		orderPage.firstStep(step);
	}

	@When("user clicks on Proceed to checkout button in Summary step")
	public void user_clicks_on_proceed_to_checkout_button_in_summary_step() {
		orderPage.proceedStandartCheckOutButton();
	}

	@When("current step is the third should be {string}")
	public void current_step_is_the_third_should_be(String step) {
		orderPage.thirdStep(step);
	}

	@When("user clicks on Proceed to checkout button in Address step")
	public void user_clicks_on_proceed_to_checkout_button_in_address_step() {
	    orderPage.clickOnProcessAddress();
	}

	@When("current step is the fourth should be {string}")
	public void current_step_should_be_the_fourth(String step) {
	   orderPage.fourthStep(step);
	}

	@When("user clicks on checkbox to agree terms of services")
	public void user_clicks_on_checkbox_to_agree_terms_of_services() {
	    orderPage.agreeTerms();
	}

	@When("user clicks on Proceed to checkout button in Shipping")
	public void user_clicks_on_proceed_to_checkout_button_in_shipping() {
	    orderPage.clickOnProcessShipping();
	}

	@When("current step is the last should be {string}")
	public void current_step_should_be_the_last(String step) {
		orderPage.endStep(step);
	}

	@When("user clicks on Pay by bank wire button")
	public void user_clicks_on_pay_by_bank_wire_button() {
	    orderPage.clickOnBankWire();
	}

	@When("user clicks on I confirm my order button")
	public void user_clicks_on_i_confirm_my_order_button() {
	    orderPage.clickOnConfirmOrder();
	}

	@Then("the message order complete is {string}")
	public void the_order_is_complete(String message) {
	    orderPage.orderComplete(message);
	}
}
