package fbTestLIstener;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class FBTest {

	@Test
	public void loginTest(ITestContext context) {
		System.out.println("login");
		WebDriver driver = DriverConnection.getDriver("https://www.facebook.com/");
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys("selenium@gmail.com");
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys("selenium@123");
		context.setAttribute("myDriver", driver);
		assertFalse(true);
		
	}
}
