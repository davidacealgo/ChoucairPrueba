package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage {

	WebDriver driver;
	
	private By emailAddress = By.id("email_create");
	private By createAccountButton = By.id("SubmitCreate");
	private By firstName = By.id("customer_firstname");
	private By lastName = By.id("customer_lastname");
	private By password = By.id("passwd");
	private By address = By.id("address1");
	private By city = By.id("city");
	private By selectState = By.id("id_state");
	private By zipCode = By.id("postcode");
	private By mobilePhone = By.id("phone_mobile");
	private By registerButton = By.id("submitAccount");
	private By accountOptions = By.className("myaccount-link-list");
	private By personalInformation = By.xpath("//*[@id=\\\"center_column\\\"]/div/div[1]/ul/li[4]/a");
	
	public registerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enterEmailAddress(String address) {
		driver.findElement(emailAddress).sendKeys(address);
	}
	
	public void clickOnCreateAccount() {
		driver.findElement(createAccountButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
