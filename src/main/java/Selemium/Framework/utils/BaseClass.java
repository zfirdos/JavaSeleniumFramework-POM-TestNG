package Selemium.Framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void browserSetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://trytestingthis.netlify.app/");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Test complete");
		driver.quit();
	}

}
