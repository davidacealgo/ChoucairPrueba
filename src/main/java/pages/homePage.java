package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

	private WebDriver driver;
	private By loginButton = By.className("login");
	private By searchBar = By.id("search_query_top");
	

	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSignIn() {
		driver.findElement(loginButton).click();
	}
	
	public void enterOnSearchBar(String search) {
		driver.findElement(searchBar).sendKeys(search);
	}
}
