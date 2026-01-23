package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P019_PartialLinkText {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));

		for (WebElement link : links) {
			System.out.println(link.getText());
//			links.get(1).click();

		}
	}
}
