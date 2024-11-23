package com.testing;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class CrossBrowserTest extends BaseClass{
   @Test(priority =1 )
	private void chorme() {
	launchBrowser("chrome");
	lauchUrl("https://www.flipkart.com/");
	quit();}
   @Test(priority =3 )

	private void firefox() {
		launchBrowser("firefox");
		lauchUrl("https://www.flipkart.com/");
		quit();}
   @Test(priority =-1 )
		private void edge() {
			launchBrowser("edge");
			lauchUrl("https://www.flipkart.com/");
			quit();}

	}

