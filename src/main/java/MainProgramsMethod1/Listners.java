package MainProgramsMethod1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case is Started ");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case is Success ");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case is Failure ");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Case is Failed But With in Success Percentage ");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test Case is Failed With Timeout");
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Case is onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Case is onFinish");
	}

}
