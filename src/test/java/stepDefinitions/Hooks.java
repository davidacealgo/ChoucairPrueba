package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		//driver = new ChromeDriver(); 
		//driver.manage().window().maximize();
		//driver.get("http://automationpractice.com/index.php");
		System.out.println("abrete sesamo");
	}
	
	@After
	public void teardown() {
		System.out.println("cierrate sesamo");
	}
}
