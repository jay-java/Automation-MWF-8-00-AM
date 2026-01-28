package basic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P004_Annotations {

	static WebDriver driver = null;

	@BeforeClass
	public static void beforeClass() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void loginTest() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys("selenium@gmail.com");
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys("selenium@123");
		Thread.sleep(2000);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
