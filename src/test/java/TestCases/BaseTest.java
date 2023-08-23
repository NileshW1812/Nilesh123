package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import MainProgramsMethod1.Utility12;

public class BaseTest {
	WebDriver driver;

	@BeforeMethod
	public void Setup() throws IOException {
		Utility12 utility = new Utility12();
		driver = utility.getDriver();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Utility12.getScreenshot(driver, result.getName());
		}
		driver.quit();
	}
}
