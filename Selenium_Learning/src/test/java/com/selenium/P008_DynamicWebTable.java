package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P008_DynamicWebTable {
	public static void main(String[] args) {
		String url = "https://demoqa.com/webtables";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> header = driver
				.findElements(By.xpath("//div[@class='web-tables-wrapper']/div[3]/div[1]/div[1]/div/div"));
//		System.out.println(header.size());

		for (int i = 1; i <= header.size(); i++) {
			WebElement text = driver.findElement(
					By.xpath("//div[@class='web-tables-wrapper']/div[3]/div[1]/div[1]/div/div[" + i + "]/div[1]"));
			System.out.print(text.getText() + " ");
		}
		System.out.println();
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='web-tables-wrapper']/div[3]/div[1]/div[2]/div"));
		for (int i = 1; i <= 3; i++) {
			List<WebElement> data = driver.findElements(
					By.xpath("//div[@class='web-tables-wrapper']/div[3]/div[1]/div[2]/div[" + i + "]/div/div"));
			for (int j = 1; j <= data.size(); j++) {
				WebElement text = driver.findElement(By.xpath(
						"//div[@class='web-tables-wrapper']/div[3]/div[1]/div[2]/div[" + i + "]/div/div[" + j + "]"));
				System.out.print(text.getText() + " ");
			}
			System.out.println();
		}
	}
}
