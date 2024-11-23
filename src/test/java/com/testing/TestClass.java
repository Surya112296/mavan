package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestClass {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		WebElement element = driver.findElement(By.xpath("(//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[4]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

}
