package com.listeners;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.base.BaseClass;

public class ExtentReport_Test {
	public static ExtentTest extenttest;
 public void extentTestReportStartup() {
 BaseClass base = new BaseClass() { };
base.extentReportStrat(null);
}
 private void extentTestReportEnd() throws IOException {
	 BaseClass base = new BaseClass() { };
base.extentReportEnd(null);
}
}


