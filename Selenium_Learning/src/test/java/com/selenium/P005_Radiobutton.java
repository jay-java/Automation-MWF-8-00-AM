package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P005_Radiobutton {
	public static void main(String[] args) {
		String url = "https://demoqa.com/radio-button";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//1.for single
//		WebElement radio = driver.findElement(By.className("custom-control-label"));
//		radio.click();
		
		//2.by list
		List<WebElement> radioList = driver.findElements(By.className("custom-control-label"));
		radioList.get(1).click();
		
	}
}
