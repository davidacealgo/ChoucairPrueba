package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {

	@Given("I enter {string} on search bar")
	public void i_enter_on_search_bar(String product) {
	    System.out.println("Step 1" + product);
	}

	@When("I click search button")
	public void i_click_search_button() {
	    System.out.println("Step 2");
	}

	@Then("the page returns the product {string}")
	public void the_page_returns_the_product_searched(String product) {
	    System.out.println("Step 3"+ product);
	}
}
