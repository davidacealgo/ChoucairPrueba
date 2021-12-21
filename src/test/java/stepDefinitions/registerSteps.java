package stepDefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.loginPage;
import pages.registerPage;

public class registerSteps{
	
	private String title;
	private homePage homePage = new homePage(DriverFactory.getDriver());
	private registerPage registerPage = new registerPage(DriverFactory.getDriver());
	private loginPage loginPage = new loginPage(DriverFactory.getDriver());
	String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?");
	}

	@Given("I click Sign in button")
	public void i_click_sign_in_button() {
	    homePage.clickOnSignIn();
	}

	@When("I enter email address in create account form")
	public void i_enter_email_address_in_create_account_form() {
	    registerPage.enterEmailAddress("prueba"+userName+"@mailinator.com");
	}

	@When("I click Create an account button")
	public void i_click_create_an_account_button() {
	    registerPage.clickOnCreateAccount();
	}

	@When("I enter first name as {string}")
	public void i_enter_first_name_as(String firstName) {
		registerPage.enterFirstName(firstName);
	}

	@When("I enter last name as {string}")
	public void i_enter_last_name_as(String lastName) {
	    registerPage.enterLastName(lastName);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
	    registerPage.enterPassword(password);
	}

	@When("I enter address as {string}")
	public void i_enter_address_as(String address) {
	    registerPage.enterAddress(address);
	}

	@When("I enter city as {string}")
	public void i_enter_city_as(String city) {
	    registerPage.enterCity(city);
	}

	@When("I select state")
	public void i_select_state() {
	    registerPage.selectState();
	}

	@When("^I enter Postal code as ([0-9]{5})$")
	public void i_enter_postal_code_as(String zip) {
	    registerPage.enterPostalCode(zip);
	}

	@When("I enter mobile phone as {string}")
	public void i_enter_mobile_phone_as(String mobilePhone) {
	    registerPage.enterMobilePhone(mobilePhone);
	}

	@When("I click the button Register")
	public void i_click_the_button_register() {
	    registerPage.clickOnRegister();
	}

	@Then("user gets title of the page")
	public void i_am_navigated_to_my_account_page() {
		title = loginPage.getPageTitle();
	}

	@Then("page title is {string}")
	public void page_title_should_be(String Title) {
	    Assert.assertTrue(title.contains(Title));
	}
	
	
}
