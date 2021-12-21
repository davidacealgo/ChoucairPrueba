package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage {

	private WebDriver driver;
	
	private By emailAddress = By.id("email_create");
	private By createAccountButton = By.id("SubmitCreate");
	private By firstName = By.id("customer_firstname");
	private By lastName = By.id("customer_lastname");
	private By password = By.id("passwd");
	private By address = By.id("address1");
	private By city = By.id("city");
	private By selectState = By.id("id_state");
	private By state = By.xpath("//*[@id=\"id_state\"]/option[6]");
	private By zipCode = By.id("postcode");
	private By mobilePhone = By.id("phone_mobile");
	private By registerButton = By.id("submitAccount");
	private By errorEmail = By.id("create_account_error");
	
	public registerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterEmailAddress(String address) {
		driver.findElement(emailAddress).sendKeys(address);
	}
	
	public void errorEmailExists() {
		System.out.println(driver.findElement(errorEmail).getText());
	}
	
	public void clickOnCreateAccount() {
		driver.findElement(createAccountButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void enterFirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}
	
	public void enterPassword(String passwd) {
		driver.findElement(password).sendKeys(passwd);
	}
	
	public void enterAddress(String Address) {
		driver.findElement(address).sendKeys(Address);
	}
	
	public void enterCity(String City) {
		driver.findElement(city).sendKeys(City);
	}

	public void selectState() {
		driver.findElement(selectState).click();
		driver.findElement(state).click();
	}
	
	public void enterPostalCode(String zip) {
		driver.findElement(zipCode).sendKeys(zip);
	}
	
	public void enterMobilePhone(String phone) {
		driver.findElement(mobilePhone).sendKeys(phone);
	}
	
	public void clickOnRegister() {
		driver.findElement(registerButton).click();
	}
	
}
