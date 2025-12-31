package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P006_WEbTable {
	public static void main(String[] args) {
		String url ="https://demoqa.com/webtables";
//		String url ="https://cosmocode.io/automation-practice-webtable/";
//		String url = "https://www.tutorialspoint.com/selenium/practice/webtables.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
//		WebElement emailText = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[4]"));
//		System.out.println(emailText.getText());
//		WebElement text = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[3]/td[3]"));
//		System.out.println(text.getText());
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[4]"));
		System.out.println(text.getText());
		
	}
}
