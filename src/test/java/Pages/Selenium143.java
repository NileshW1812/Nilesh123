package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium143 {

	WebDriver driver;

	public Selenium143(WebDriver driver) {
		this.driver = driver;
	}

	public String getWhatIsSeleniumText() {
		return driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText();
	}

}
