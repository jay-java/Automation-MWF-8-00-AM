package com.mobile.MyFirstTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorsDemo {
	static AppiumDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			opencalculator();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void opencalculator() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
		cap.setCapability("appium:udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "16");
		//these 2 capabilities are for real device
//		cap.setCapability("appPackage", "com.android.bbkcalculator");
//		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
		
		//these 2 capabilities are for virtual device
		cap.setCapability("appium:automationName", "UiAutomator2");
		cap.setCapability("appium:app", "C:\\Users\\Admin\\Downloads\\Calculator_8.7 (735708245)_APKPure.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Thread.sleep(2000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		// Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		// Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		// Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
		// Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

		// Thread.sleep(1000);
		String value = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"No formula\"]")).getText();
		System.out.println("My Output is... " + value);

	}
}
