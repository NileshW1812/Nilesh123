package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MainProgramsMethod1.Utility12;
import Pages.MakeMyTrip;

//@Listeners(MainProgramsMethod1.Listners.class)
public class VerifyFilghtAnhorTag_c1 {
	WebDriver driver;
	MakeMyTrip makemytrip;

	public static Logger demologger = LogManager.getLogger(VerifyFilghtAnhorTag_c1.class);

	@BeforeTest(alwaysRun = true)
	public void Setup() throws IOException, InterruptedException {
		demologger.info("ready driver launch url");
		driver = Utility12.getDriver();
		demologger.info("url opned");
		driver.get(Utility12.getProperties("url"));
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		demologger.atWarn();
		makemytrip = new MakeMyTrip(driver);

	}

	@Test(priority = 1, groups = { "sanity" }, enabled = true)
	public void VerifyFlightlink() {
		demologger.debug("user on page");
		JavascriptExecutor javascriptExecuter = (JavascriptExecutor) driver;
		javascriptExecuter.executeScript("arguments[0].click", makemytrip.getFlightlink());
		demologger.info("flight url opned");
	}

	@Test(priority = 2, groups = { "sanity" }, enabled = true)
	public void VerifyOneWayButton() {
		demologger.info("driver switch to radio button");
		boolean b1 = makemytrip.getOnewayradiobutton().isEnabled();
		System.out.println(b1);
		demologger.debug("verify radio button is enable or not");

	}

	@Test(priority = 3, groups = { "sanity" }, enabled = true)
	public void VerifyFromText() {

		WebElement elm = makemytrip.getFromtext();
		boolean b1 = makemytrip.Clickable(elm);
		System.out.println(b1);
		demologger.error("elemnt is no clickable");
		makemytrip.getFromtext().sendKeys("Pune");
	}

	@Test(priority = 4, groups = { "sanity" }, enabled = true)
	public void VerifyToText() {
		demologger.info("Verify to text entring");
		WebElement elm1 = makemytrip.getTotext();
		boolean b2 = makemytrip.Clickable(elm1);
		System.out.println(b2);
		demologger.info("user able to enter the text");
		makemytrip.getTotext().sendKeys("Bangaluru");

	}

	@Test(priority = 5, groups = { "sanity" }, enabled = true)
	public void VerifyDepatureDate() {

		// driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		makemytrip.getDeparturedate().clear();

		driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Thu Aug 24 2023')]"))
				.click();

	}

	@Test(priority = 6, groups = { "sanity" }, enabled = true)
	public void VerifypageTitie() {

		assertEquals(driver.getTitle(), "Flight Booking, Cheap Flights , Air Ticket Booking at Lowest Airfare | MakeMyTrip");

	}

	@Test(priority = 6, groups = { "sanity" }, enabled = true)
	public void VerifyUrl() {
		
		assertEquals(driver.getCurrentUrl(), "https://www.makemytrip.com/flights/");
	}

	@AfterMethod(alwaysRun = true)
	public void teardown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Utility12.getScreenshot(driver, result.getName());
		}
//		driver.quit();
	}
}
