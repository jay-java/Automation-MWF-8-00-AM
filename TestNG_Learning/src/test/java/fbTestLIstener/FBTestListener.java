package fbTestLIstener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBTestListener implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("myDriver");
		TakesScreenshot ss = (TakesScreenshot) driver;

		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\screenshot\\" + result.getName() + ".png");

		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
