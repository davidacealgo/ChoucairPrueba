package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class orderPage {

	private WebDriver driver;
	
	private By firstStep = By.xpath("//*[@id=\"order_step\"]/li[1]");
	private By proceedButtonCheckOut = By.className("standard-checkout");
	private By thirdStep = By.xpath("//*[@id=\"order_step\"]/li[3]");
	private By processAddress = By.name("processAddress");
	private By fourthStep = By.xpath("//*[@id=\"order_step\"]/li[4]");
	private By agreeTermsCheckBox = By.name("cgv");
	private By processShipping = By.name("processCarrier");
	private By endStep = By.id("step_end");
	private By bankWire = By.className("bankwire");
	private By confirmOrderButton = By.xpath("//*[@id=\"cart_navigation\"]/button");
	private By orderComplete = By.className("cheque-indent");
	
	public orderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void firstStep(String step) {
		Assert.assertTrue(driver.findElement(firstStep).getText().contains(step));
	}
	
	public void proceedStandartCheckOutButton () {
		driver.findElement(proceedButtonCheckOut).click();
	}
	
	public void thirdStep(String step) {
		Assert.assertTrue(driver.findElement(thirdStep).getText().contains(step));
	}
	
	public void clickOnProcessAddress() {
		driver.findElement(processAddress).click();
	}
	
	public void fourthStep(String step) {
		Assert.assertTrue(driver.findElement(fourthStep).getText().contains(step));
	}
	
	public void agreeTerms() {
		driver.findElement(agreeTermsCheckBox).click();
	}
	
	public void clickOnProcessShipping() {
		driver.findElement(processShipping).click();
	}
	
	public void endStep(String step) {
		Assert.assertTrue(driver.findElement(endStep).getText().contains(step));
	}
	
	public void clickOnBankWire() {
		driver.findElement(bankWire).click();
	}
	
	public void clickOnConfirmOrder() {
		driver.findElement(confirmOrderButton).click();
	}
	
	public void orderComplete(String message) {
		Assert.assertTrue(driver.findElement(orderComplete).getText().contains(message));
	}
}
