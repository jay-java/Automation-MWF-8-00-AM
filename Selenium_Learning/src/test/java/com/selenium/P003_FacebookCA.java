package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P003_FacebookCA {
	public static void main(String[] args) {
//		String url ="https://demoqa.com/text-box";
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();

		WebElement firstNameEle = driver.findElement(By.name("firstname"));
		firstNameEle.sendKeys("selenium");

		WebElement lastNameEle = driver.findElement(By.name("lastname"));
		lastNameEle.sendKeys("user");

		WebElement emailOrMoEle = driver.findElement(By.name("reg_email__"));
		emailOrMoEle.sendKeys("selenium@gmail.com");

		WebElement passwordEle = driver.findElement(By.name("reg_passwd__"));
		passwordEle.sendKeys("selenium@123");
	}
}
