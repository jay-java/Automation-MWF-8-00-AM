package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P013_Calendar {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = DriverConnection.getDriver(url);
		Thread.sleep(3000);
		// switched to iframe
		WebElement iFrame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(iFrame);

		// click on textfield
		WebElement textField = driver.findElement(By.id("datepicker"));
		textField.click();

		String myYear = "2020";
		String myMonth = "September";
		String myDate = "5";

		WebElement currentYear = driver.findElement(By.className("ui-datepicker-year"));
		System.out.println(currentYear.getText());

		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentYear.getText());
		System.out.println("my year : " + y1);
		System.out.println("current year : " + y2);

		// for year
		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if (y1 > y2) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			}
		}

		// for month
		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if (y1 > y2) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			}
		}

		// for date
		List<WebElement> dates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for (WebElement date : dates) {
			System.out.println(date.getText());
			if (date.getText().equals(myDate)) {
				date.click();
			}
		}
	}
}
