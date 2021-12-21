package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	private WebDriver driver;
	private By loginButton = By.className("login");
	private By searchBar = By.id("search_query_top");
	private By searchButton = By.name("submit_search");
	private By blouseProduct = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");

	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSignIn() {
		driver.findElement(loginButton).click();
	}
	
	public void enterOnSearchBar(String search) {
		driver.findElement(searchBar).sendKeys(search);
	}
	
	public void clickOnSearchButton() {
		driver.findElement(searchButton).click();
	}
	
	public String getProductName() {
		WebElement element = driver.findElement(blouseProduct);
		return element.getAttribute("title");
	}
}
