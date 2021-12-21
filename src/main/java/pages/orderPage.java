package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orderPage {

	private WebDriver driver;
	
	private By firstStep = By.className("step_current  first");
	private By proceedButtonCheckOut = By.className("standard-checkout");
	private By thirdStep = By.className("step_current third");

	public orderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void firstStep() {
		System.out.println(driver.findElement(firstStep).getText());
	}
	
	public void proceedStandartCheckOutButton () {
		driver.findElement(proceedButtonCheckOut).click();
	}
	
	public void thirdStep() {
		System.out.println(driver.findElement(thirdStep).getText());
	} 
}
