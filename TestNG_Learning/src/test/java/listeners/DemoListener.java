package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test run started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test run success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test finished");
	}
}
