package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class storePage {

	private WebDriver driver;
	private By productBlouse = By.xpath("//*[@id=\"center_column\"]/ul/li[2]");
	private By addToCartButton = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]");
	private By proceedToCheckOutButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	
	public storePage(WebDriver driver) {
		this.driver = driver;
	}


	public void hoverProduct() {
		WebElement product = driver.findElement(productBlouse);
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.elementToBeClickable(product));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", product);
		Actions action = new Actions(driver);
		action.moveToElement(product);
		action.perform();
	}
	
	public void clicAddToCartButton() {
		WebElement addCartButton = driver.findElement(addToCartButton);
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.elementToBeClickable(addCartButton));
		Actions action = new Actions(driver);
		action.moveToElement(addCartButton);
		action.click().build().perform();
	}
	
	public void clickProceedToCheckOutButton() {
		driver.findElement(proceedToCheckOutButton).click();
	}
	
}
