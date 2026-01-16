package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P014_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/menu";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement m1 = driver.findElement(By.linkText("Main Item 1"));
		WebElement m2 = driver.findElement(By.linkText("Main Item 2"));
		WebElement m3 = driver.findElement(By.linkText("Main Item 3"));

		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(m1).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(m2).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(m3).build().perform();
		Thread.sleep(2000);


	}
}
