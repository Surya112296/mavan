package com.runner;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageobjectmaneger.OpenMrsPageObjectManger;

public class TestRunner extends BaseClass {
	OpenMrsPageObjectManger pom = new OpenMrsPageObjectManger();

	@BeforeTest
	public void settUp() throws IOException {
launchBrowser(pom.getFileReader().getDataProperty("browser"));
lauchUrl(pom.getFileReader().getDataProperty("url"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
   private void validUserNameAndPassword() throws IOException {
	Assert.assertTrue(pom.getLoginMrs().validUserAndPassword());
}@Test(invocationCount = 2,priority = 1)
	 private void emptyUserAndPassword() throws IOException {
			Assert.assertTrue(pom.getLoginMrs().emptyUserAndPassword());}

@Test(priority = 2)
 private void invalidUserNameAndPassword() throws IOException {
	Assert.assertTrue(pom.getLoginMrs().invalidUserAndPassword());
}
@Test(priority = 3)
private void notSelectLocation() throws IOException {
	Assert.assertTrue(pom.getLoginMrs().notSelectLocation());
}
	

@AfterTest

private void close() {
quit();
}
}
