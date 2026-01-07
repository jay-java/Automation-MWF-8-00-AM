package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P012_IFrameSwitch {
	public static void main(String[] args) {
		String url = "https://demoqa.com/frames";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement iFrame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iFrame1);
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println("frame 1 : " + text.getText());

		driver.switchTo().window(driver.getWindowHandle());

		WebElement iFrame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(iFrame2);
		WebElement text1 = driver.findElement(By.id("sampleHeading"));
		System.out.println("frame 2 : " + text1.getText());

	}
}
