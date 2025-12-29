package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P003_FacebookCA {
	public static void main(String[] args) {
//		String url ="https://demoqa.com/text-box";
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement firstNameEle = driver.findElement(By.name("firstname"));
		firstNameEle.sendKeys("selenium");

		WebElement lastNameEle = driver.findElement(By.name("lastname"));
		lastNameEle.sendKeys("user");
		
		//05 -09 - 2004
		//1.select by index
		WebElement days = driver.findElement(By.id("day"));
		Select day = new Select(days);
		day.selectByIndex(4);
		
		//2.select by value
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("9");
		
		//3.select by visible text
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByVisibleText("2004");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(0).click();

		WebElement emailOrMoEle = driver.findElement(By.name("reg_email__"));
		emailOrMoEle.sendKeys("selenium@gmail.com");

		WebElement passwordEle = driver.findElement(By.name("reg_passwd__"));
		passwordEle.sendKeys("selenium@123");
	}
}
