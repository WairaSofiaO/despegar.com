package Automatizacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class SearchTest {

	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("WebDriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.co");
	}
	
}
