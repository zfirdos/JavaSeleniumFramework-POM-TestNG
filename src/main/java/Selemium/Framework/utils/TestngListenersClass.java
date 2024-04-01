package Selemium.Framework.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListenersClass implements ITestListener{
		
	public void onTestStart(ITestResult result) {
	    System.out.println("onTestStart");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
	  }
	
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	  }
}
