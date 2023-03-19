package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class challenge1 {
	@Test
	private void tc1() {
		System.out.println("test case 1");
	}

	@Test
	private void tc5() {
		System.out.println("test case 5");
	}

	@Test
	private void tc2() {
		System.out.println("test case 2");
	}
	@BeforeMethod
	private void startDate() {
System.out.println("startDate");
	}
	@AfterMethod
	private void endDate() {
System.out.println("EndDate");
	}
	@AfterClass
	private void closeTheBrowser() {
System.out.println("closeBrowsers");
	}
	
	@BeforeClass
	private void launchBrowser() {
   System.out.println("launchTheBrowser");
	}
	
	
}
