package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripDatePickers {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");

		Thread.sleep(5000);

		driver.manage().deleteAllCookies();

//		driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		WebElement elm = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
		JavascriptExecutor javascriptExecuter = (JavascriptExecutor) driver;
		javascriptExecuter.executeScript("arguments[0].click", elm);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Thu Aug 24 2023')]"))
				.click();

//		WebElement elm1 = driver
//				.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Thu Aug 24 2023')]"));
//		;
//		javascriptExecuter.executeScript("arguments[0].click", elm1);
		Thread.sleep(5000);
	}

}
