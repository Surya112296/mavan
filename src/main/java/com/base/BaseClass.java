package com.base;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.element.Element;
import javax.swing.Action;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class BaseClass {
	public static WebDriver driver;
	public static ExtentReports extentReports;
	public static File file;

	protected static WebDriver launchBrowser(String Bowsername) {
		try {
			if (Bowsername.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			if (Bowsername.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();

			}
			if (Bowsername.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			Assert.fail("ERROR DURING BROWSER LAUCH");

		}
		driver.manage().window().maximize();
		return driver;
	}

	protected static void lauchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("ERROR DURING BROWSER URL LAUCH");
		}
	}

	protected static void colseBlowser() {
		try {
			driver.close();
		} catch (Exception e) {
			Assert.fail("ERROR DURING BROWSER CLOSE");
		}
	}

	protected static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("ERROR DURING BROWSER QUIT");
		}
	}

	protected static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			Assert.fail("ERROR DURING NAVIGATETO BROWSER");
		}
	}

	protected static void navigateBlack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			Assert.fail("ERROR DURING NAVIGATEBLACK BROWSER");
		}
	}

	protected static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			Assert.fail("ERROR DURING NAVIGATEREFRESH BROWSER");
		}
	}

	protected static void navigateForword() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			Assert.fail("ERROR DURING NAVIGATEFORWORD BROWSER");
		}
	}

	protected static Actions Action_Medhod() {
		Actions action = new Actions(driver);
		return action;
	}

	protected static Select select_Method(WebElement element) {

		Select select = new Select(element);
		return select;
	}

	protected static void dropDownindex(WebElement element, int index) {
		try {
			select_Method(element).selectByIndex(index);
		} catch (Exception e) {
			Assert.fail("ERROR DURING dropDownindex BROWER");
		}
	}

	protected static void dropDownvalue(WebElement element, String value) {
		try {
			select_Method(element).selectByValue(value);
		} catch (Exception e) {
			Assert.fail("ERROR DURING dropDownvalue BROWER");
		}
	}

	protected static void dropDowntext(WebElement element, String text) {
		try {
			select_Method(element).selectByVisibleText(text);
		} catch (Exception e) {
			Assert.fail("ERROR DURING dropDowntext BROWER");
		}
	}

	protected static void moveElement(WebElement element) {
		try {
			Action_Medhod().moveToElement(element);
		} catch (Exception e) {
			Assert.fail("ERROR DURING MOVEELEMENT BROWER");
		}
	}

	protected static void click(WebElement element) {
		try {
			Action_Medhod().click(element);
		} catch (Exception e) {
			Assert.fail("ERROR DURING CLICK BROWER");
		}
	}

	protected static void elementClick(WebElement element) {

		element.click();

	}

	protected static void contextClick(WebElement element) {
		try {
			Action_Medhod().contextClick(element);
		} catch (Exception e) {
			Assert.fail("ERROR DURING CONTEXTCLICK BROWER");
		}
	}

	protected static void dragAndDrop(WebElement source, WebElement element) {
		try {
			Action_Medhod().dragAndDrop(source, element).perform();
		} catch (Exception e) {
			Assert.fail("ERROR DURING DRAPANDDROP BROWER");
		}
	}

	protected static WebElement passInput(WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING PASSING INPUT");
		}
		return element;
	}

	

	protected void validation(String actual, String expacted) {
		try {
			Assert.assertEquals(actual, expacted);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING VALIDATION ERROR");

		}

	}

	public static void extentReportStrat(String location) {
		extentReports = new ExtentReports();
		file = new File(location);
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
//		
//		
	}

	public static void extentReportEnd(String location) throws IOException {
		extentReports.flush();
		file = new File(location);
		Desktop.getDesktop().browse((file).toURI());

	}

	public static String tackScreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String timestamp = new SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("screenshort\\.png" + "_" + timestamp + ".png");
		FileHandler.copy(scrfile, destfile);
		return destfile.getAbsolutePath();

	}
}