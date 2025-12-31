package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P007_WebTable {
	public static void main(String[] args) {
		String url ="https://demoqa.com/webtables";
		WebDriver driver = DriverConnection.getDriver(url);
//		
//		List<WebElement> rows = driver.findElements(By.xpath("//div[@role='row']"));
//		System.out.println(rows.size());
		
		WebElement firstName = driver.findElement(By.xpath("//div[@class='web-tables-wrapper']/div[3]/div[1]/div[1]/div/div[1]/div[1]"));
		System.out.println(firstName.getText());
	}
}
