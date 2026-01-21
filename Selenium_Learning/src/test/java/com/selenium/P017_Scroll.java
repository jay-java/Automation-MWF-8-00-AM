package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P017_Scroll {
	public static void main(String[] args) {
		String url = "https://www.browserstack.com/guide/selenium-scroll-tutorial";
		WebDriver driver = DriverConnection.getDriver(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// 1.scroll by pixels
//		js.executeScript("window.scrollBy(0,500)", "");

		//2.scroll by element
//		WebElement signup = driver.findElement(By.linkText("Start here."));
//		js.executeScript("arguments[0].scrollIntoView();", signup);
//		signup.click();
		
		//3.scroll by bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
