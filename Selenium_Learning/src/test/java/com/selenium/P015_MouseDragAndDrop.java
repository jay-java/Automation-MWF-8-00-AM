package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P015_MouseDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";

		WebDriver driver = DriverConnection.getDriver(url);

		WebElement iFrame = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(iFrame);

		WebElement img1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement img2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));

		WebElement trash = driver.findElement(By.id("trash"));
		Actions actions = new Actions(driver);

		actions.clickAndHold(img1).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		actions.clickAndHold(img2).moveToElement(trash).release().build().perform();

	}
}
