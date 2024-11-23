package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

import io.reactivex.rxjava3.functions.Action;

public class SampleTest extends Base_Class{
	
	public static void main(String[] args) {
		browserLaunch("chrome");
		launchUrl("https://magento.softwaretestingboard.com/");
		WebElement women = driver.findElement(By.xpath("(//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[1]"));	
		hoverTheElement(women);
		WebElement top = driver.findElement(By.xpath("//*[@id='ui-id-9']"));	
		hoverTheElement(top);
		WebElement jacket= driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]"));	
		moveToTHeElementAndClick(jacket);
		
		//WebElement element4= driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));	
		//oveToTHeElementAndClick(element4);
		
	}}

