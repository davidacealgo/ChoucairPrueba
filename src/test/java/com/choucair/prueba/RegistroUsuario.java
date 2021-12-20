package com.choucair.prueba;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistroUsuario {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}
	
	@Test
	public void prueba() throws InterruptedException {
		WebElement signInButton = driver.findElement(By.className("login"));
		signInButton.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
