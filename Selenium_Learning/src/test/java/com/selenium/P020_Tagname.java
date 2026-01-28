package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P020_Tagname {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());

		String str[] = new String[allLinks.size()];
		int index = 0;
		for (WebElement link : allLinks) {
			System.out.println(link.getText());

			if (!link.getText().equals("")) {
				str[index] = link.getText();
				index++;
			}
		}
		System.out.println("===========================");
		System.out.println("without blank text all links");
		System.out.println("===========================");

		for (String s : str) {
			System.out.println(s);
			driver.findElement(By.linkText(s)).click();
			Thread.sleep(2000);

			driver.navigate().back();
		}

	}
}
