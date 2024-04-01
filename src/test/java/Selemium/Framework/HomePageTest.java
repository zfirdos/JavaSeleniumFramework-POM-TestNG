package Selemium.Framework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Selemium.Framework.pageObject.HomePage;
import Selemium.Framework.utils.BaseClass;

public class HomePageTest extends BaseClass{ //Inheritance

	SoftAssert softAssert = new SoftAssert();
	HomePage homePage;
	//@ - annotation - Its a kind of tag that provide information about the below method.
	@Test(priority=-1, description = "This test is adding the first Name", testName = "abcd") //priority can be negative
	public void abcd() throws InterruptedException {
		try {
		//Homepage
		homePage = new HomePage();
		homePage.addFirstName();
		System.out.println("abcd");
		}catch(Exception e)
		{
			System.out.println("Hello");
		}
	}
	
	@Test (priority=2, description = "This test is adding the Last Name", testName = "abc1") //priority can be zero
	public void abc1() throws InterruptedException {
		//Homepage
		homePage = new HomePage();
		homePage.addLastName();
		System.out.println("abc1");
		softAssert.assertEquals(10, 10);
		softAssert.assertAll();// hard assertion
	}
	
	//soft assertion
	
	@Test (priority=1 , description = "This test is deals with both", dependsOnMethods = "abc1", enabled = false)
	public void test2() throws InterruptedException {
		//Contact
		homePage = new HomePage();
		homePage.addDetails();
		System.out.println("Test2");
	}
	
	@Test(dataProvider = "dp")
	public void name1(String name) {
		System.out.println("This is my name1 method"+name);
	}
	
	
	@DataProvider(name = "dp")
	public Object[][] method() {
		return new Object[][] {{"FN"},{"LN"}};
	}
}
