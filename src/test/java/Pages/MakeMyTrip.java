package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	WebDriver driver;
	WebElement flightlink;
	WebElement onewayradiobutton;
	WebElement fromtext;
	WebElement totext;
	WebElement departuredate;
	WebElement returndate;

	public MakeMyTrip(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFlightlink() {
		setFlightlink();
		return flightlink;
	}

	public void setFlightlink() {
		this.flightlink = driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/flights/']"));
	}

	public WebElement getOnewayradiobutton() {
		setOnewayradiobutton();
		return onewayradiobutton;
	}

	public void setOnewayradiobutton() {
		this.onewayradiobutton = driver.findElement(By.xpath("//ul//li[@class='selected']"));
	}

	public WebElement getFromtext() {
		setFromtext();
		return fromtext;
	}

	public void setFromtext() {
		this.fromtext = driver.findElement(By.xpath("//input[@id='fromCity']"));
	}

	public WebElement getTotext() {
		setTotext();
		return totext;
	}

	public void setTotext() {
		this.totext = driver.findElement(By.xpath("//input[@id='toCity']"));
	}

	public WebElement getDeparturedate() {
		setDeparturedate();
		return departuredate;
	}

	public void setDeparturedate() {
		this.departuredate = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
	}

	public WebElement getReturndate() {
		setReturndate();
		return returndate;
	}

	public void setReturndate() {
		this.returndate = driver.findElement(By.xpath("//input[@id=\"return\"]"));
	}
	

	public boolean Clickable(WebElement elm1) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(elm1));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
