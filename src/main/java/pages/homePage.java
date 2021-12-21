package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

	private WebDriver driver;
	private By loginButton = By.className("login");

	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSignIn() {
		driver.findElement(loginButton).click();
	}
}
