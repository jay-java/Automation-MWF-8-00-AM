package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P011_WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();

		String mainWin = driver.getWindowHandle();
		System.out.println("main Window : " + mainWin);

		Set<String> allWin = driver.getWindowHandles();
		for (String win : allWin) {
			System.out.println(win);
			if (!win.equals(mainWin)) {
				driver.switchTo().window(win);

				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("selenium@gmail.com");

				WebElement btn = driver.findElement(By.name("btnLogin"));
				btn.click();
//				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}
}
