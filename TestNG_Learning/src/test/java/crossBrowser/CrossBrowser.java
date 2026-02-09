package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class CrossBrowser {

	@Parameters({ "browser" })
	@Test
	public void browserTest(String browser) {
		WebDriver driver = null;
		String url = "https://www.facebook.com/";
		if (browser.equals("chrome")) {
			driver = DriverConnection.getDriver(url);
		}
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);

		}
		if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Admin\\Downloads\\edgedriver_win32\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
	}
}
