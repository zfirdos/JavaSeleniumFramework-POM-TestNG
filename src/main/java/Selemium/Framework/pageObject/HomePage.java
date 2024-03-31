package Selemium.Framework.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selemium.Framework.utils.BaseClass;

public class HomePage extends BaseClass {

	// POM – page object model
	// POM is a design pattern in selenium that creates object repository for
	// storing all web elements.
	// Its helps to reduce code duplication and also improves Test case maintenance.

	/*
	 * WebElement element = driver.findElement(By.xpath(""));
	 * element.sendkeys();
	 */

	// Declaration of locators
	// WebElement element = driver.findElement(By.xpath(""));
	
	@FindBy(xpath = "//input[@id='fname']")
	WebElement firstnameInput;

	@FindBy(xpath = "//input[@id='lname']")
	WebElement lastnameInput;

	// initialization of webelements
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Perform actions on elements
	public void addFirstName() {
		firstnameInput.sendKeys("Test1");
	}

	public void addLastName() {
		lastnameInput.sendKeys("Test22");
	}
	
	public void addDetails() throws InterruptedException {
		addFirstName();
		Thread.sleep(1000);
		addLastName();
		Thread.sleep(1000);
	}

}
