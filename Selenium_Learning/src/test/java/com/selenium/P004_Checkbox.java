package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P004_Checkbox {
	public static void main(String[] args) {
		String url = "https://demoqa.com/checkbox";
		WebDriver driver= DriverConnection.getDriver(url);
		
//		WebElement homeCheckBox = driver.findElement(By.className("rct-title"));
//		homeCheckBox.click();
		
		WebElement arrow = driver.findElement(By.xpath(""));
		arrow.click();
	}
}
