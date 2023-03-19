package org.testng;

import org.junit.testing.baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class challenge4 extends baseclass {
	@Test(priority=9)
	private void tc1() {
launchUrl("https://mail.google.com/mail/u/0/#inbox");
	}
	@Test(priority=-50)
	private void tc2() {
		launchUrl("https://inmakes.com/");
	}
	@Test(priority=5)
	private void tc3() {
		launchUrl("https://www.redbus.in/");
	}
	@Test 
	private void tc4() {
		launchUrl("https://www.flipkart.com/");
	}
	@Test(priority=0)
	private void tc5() {
		launchUrl("https://www.amazon.com/");
    }
	@Test(priority=-10)
	private void tc6() {
		launchUrl("https://en-gb.facebook.com/");
	}
	@Test(priority=-1)
	private void tc7() {
		launchUrl("https://www.youtube.com/");
	}
	@BeforeClass
	private void browserlaunch() {
    launchBrowser();
    windowMaximize();
	}
	@AfterClass
	private void closebrowser() {
    closeEntireBrowser();
	}

}
