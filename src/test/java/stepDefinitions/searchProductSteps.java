package stepDefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class searchProductSteps {

	private homePage homePage = new homePage(DriverFactory.getDriver());
	
	@Given("I enter {string} on search bar")
	public void i_enter_on_search_bar(String product) {
	    homePage.enterOnSearchBar(product);
	}

	@When("I click search button")
	public void i_click_search_button() {
	    homePage.clickOnSearchButton();
	}

	@Then("the page returns the product {string}")
	public void the_page_returns_the_product_searched(String product) {
	    String titleProduct = homePage.getProductName();
	    Assert.assertTrue(titleProduct.contains(product));
	}
	
}
