package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class storePage {

	private WebDriver driver;
	private By productBlouse = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div");
	private By addToCartButton = By.className("ajax_add_to_cart_button");
	private By proceedToCheckOutButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	
	public storePage(WebDriver driver) {
		this.driver = driver;
	}

	//Actions action = new Actions(driver);
	
	public void hoverProduct() {
		WebElement product = driver.findElement(productBlouse);
		//action.moveToElement(product);
	}
	
	public void clicAddToCartButton() {
		WebElement addCartButton = driver.findElement(addToCartButton);
		//action.moveToElement(addCartButton);
		//action.click().build().perform();
	}
	
	public void clickProceedToCheckOutButton() {
		driver.findElement(proceedToCheckOutButton).click();
	}
	
}
