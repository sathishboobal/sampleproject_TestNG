package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class D {
	@Test
	private void tc20() {
System.out.println("test case 20");
	}
@BeforeClass
private void launchBrowser() {
System.out.println("BrowserLaunch");
}
@AfterClass
private void closePage() {
System.out.println("closeThePage");
}

}
