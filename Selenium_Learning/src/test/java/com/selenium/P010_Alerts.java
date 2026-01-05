package com.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P010_Alerts {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);

		// 1.Alert
//		WebElement btn1 = driver.findElement(By.id("alertButton"));
//		btn1.click();
//		Alert alert1 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert1.accept();

		// 2.alert
//		WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
//		btn2.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert1 = driver.switchTo().alert();
//		alert1.accept();
		
		//3.alert
//		WebElement btn1 = driver.findElement(By.id("confirmButton"));
//		btn1.click();
//		Alert alert1 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert1.dismiss();
		
		//4.alert
		WebElement btn1 = driver.findElement(By.id("promtButton"));
		btn1.click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.sendKeys("hello testers");
		alert1.accept();
	}
}
