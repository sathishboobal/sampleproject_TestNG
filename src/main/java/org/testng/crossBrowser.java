package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossBrowser {
	@Parameters({"username","password","browser"})
	@Test
	private void tc1(String u,String p,String b) throws InterruptedException {
		WebDriver driver;
		if (b.equals("chromebrowser")) {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();	
		}
		else if (b.equals("internetexplorerbrowser")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}

		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
		}
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.id("ap_email"));
		mail.sendKeys(u);
		
		WebElement btn = driver.findElement(By.id("continue"));
		btn.click();
		
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(p);
	}

}
