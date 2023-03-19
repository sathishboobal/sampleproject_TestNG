package org.testng;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.baseclass;
import baseclass.gmailloginpom;

public class challenge3 extends baseclass {
	@Test
	private void tc1() {
		launchUrl("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AWnogHeQgiY2d0DP258q7f5xp0Jcz0u8UX55KIj-UYsPnVghFg63gjTxIY2kYXRAq0fhXT6WwLsQKw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		gmailloginpom g = new gmailloginpom();
		passText("sathish@gmail.com", g.getMailid());
		g.getClick();
		System.out.println("test case 1");
	}

	@Test(invocationCount = 2)
	private void tc2() {
		launchUrl("https://inmakes.com/");
		System.out.println("test case 2");
	}

	@BeforeClass
	private void launchbrowser() {
		launchBrowser();
		windowMaximize();
	}

	@AfterClass
	private void closethebrowser() {
		closeEntireBrowser();

	}

	@Test(enabled = false)
	private void tc3() {
		launchUrl("https://www.redbus.in/");
		System.out.println("test case 3");

	}

	@BeforeMethod
	private void starttime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endtime() {
		Date d = new Date();
		System.out.println(d);

	}

}
