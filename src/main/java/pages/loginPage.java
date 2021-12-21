package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	private WebDriver driver;
	
	private By emailId = By.id("email");
	private By passwd = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By womenCategory = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void enterUserName (String username) {
		driver.findElement(emailId).sendKeys(username);
	}
		
	public void enterPassword (String password) {
		driver.findElement(passwd).sendKeys(password);
	}
	
	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}
	
	public void clickOnWomenCategory() {
		driver.findElement(womenCategory).click();
	}
	
	
}
