package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P002_FacebookLogin {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement emailElement = driver.findElement(By.name("email"));
		emailElement.sendKeys("selenium@gmail.com");

		WebElement passElement = driver.findElement(By.name("pass"));
		passElement.sendKeys("selenium@123");

		WebElement loginBTN = driver.findElement(By.name("login"));
		loginBTN.click();
	}
}
