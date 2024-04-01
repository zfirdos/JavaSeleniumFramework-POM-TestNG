package Selemium.Framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Listeners(TestngListenersClass.class)
public class BaseClass {

	public static WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void browserSetUp(@Optional("chrome") String browser) {
		System.out.println("Before Test");
		if(browser.contains("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(browser.contains("firefox"))
		{
			driver = new FirefoxDriver();
		}		
		driver.manage().window().maximize();
		driver.navigate().to("https://trytestingthis.netlify.app/");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("After Test");
		System.out.println("Test complete");
		driver.quit();
	}

	/*
	 * @BeforeMethod public void beforeMethodTest() {
	 * System.out.println("Before Method"); }
	 * 
	 * @AfterMethod public void afterMethodTest() {
	 * System.out.println("AfterMethod"); }
	 * 
	 * @BeforeClass public void beforeClassTest() {
	 * System.out.println("Before Class"); }
	 * 
	 * @AfterClass public void afterClassTest() { System.out.println("After Class");
	 * }
	 * 
	 * @BeforeSuite public void beforeSuiteTest() {
	 * System.out.println("Before Suite"); }
	 * 
	 * @AfterSuite public void afterSuiteTest() { System.out.println("After Suite");
	 * }
	 */
}
