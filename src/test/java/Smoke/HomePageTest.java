package Smoke;

import org.testng.annotations.Test;

import Selemium.Framework.pageObject.HomePage;
import Selemium.Framework.utils.BaseClass;

public class HomePageTest extends BaseClass{ //Inheritance

	HomePage homePage;
	//@ - annotation - Its a kind of tag that provide information about the below method.
	@Test
	public void test1() throws InterruptedException {
		
		homePage = new HomePage();
		homePage.addDetails();
	}
}
