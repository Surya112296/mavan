package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
@BeforeSuite
private void propetry() {
System.out.println("propetysetting");
}
@BeforeTest
private void bowserlaunch() {
System.out.println("browserlauch");
}@BeforeClass
private void urllaunch() {
	System.out.println("urallaunch");

}@BeforeMethod
private void login() {
System.out.println("login");
}@Test
private void women() {
System.out.println("women");
}@Test
private void kit() {
System.out.println("kit");
}
@Test
private void men() {
System.out.println("men");
}@AfterMethod
private void logout() {
System.out.println("logout");

}
@AfterClass
public void screensort() {
	System.out.println("screensort");
	}
}
