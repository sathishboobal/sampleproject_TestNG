package org.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class C {
	@Test
	private void tc10() {
System.out.println("test case 10");
	}
@Test
private void tc12() {
System.out.println("test case 12");
}
@BeforeMethod
 private void startTime() {
	System.out.println("startTime");
}
@AfterMethod
private void endDate() {
System.out.println("endTime");
}





}

