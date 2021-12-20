package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	WebDriver driver;
	
	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "login")
	public WebElement loginButton;
	
	public void isHomePage() {
		loginButton.isDisplayed();
	}
	
	public void clickOnSignIn() {
		loginButton.click();
	}
}
