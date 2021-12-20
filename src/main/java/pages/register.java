package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class register {

	WebDriver driver;
	
	@FindBy(className = "login")
	public WebElement loginButton;
	
	@FindBy(id = "email_create")
	public WebElement emailAddress;
	
	@FindBy(id = "SubmitCreate")
	public WebElement createAccountButton;
	
	@FindBy(id = "customer_firstname")
	public WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	public WebElement lastName;
	
	@FindBy(id = "passwd")
	public WebElement password;
	
	@FindBy(id = "address1")
	public WebElement address;
	
	@FindBy(id = "city")
	public WebElement city;
	
	@FindBy(id = "id_state")
	public WebElement selectState;
	
	@FindBy(id = "postcode")
	public WebElement zipCode;
	
	@FindBy(id = "phone_mobile")
	public WebElement mobilePhone;
	
	@FindBy(id = "submitAccount")
	public WebElement registerButton;
	
	@FindBy(className = "myaccount-link-list")
	public WebElement accountOptions;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
	public WebElement personalInformation;
}
