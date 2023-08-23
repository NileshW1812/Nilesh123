package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoPage {

	WebDriver driver;
	WebElement clicktogetalertbutton;

	public OmayoPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getClicktogetalertbutton() {
		setClicktogetalertbutton();
		return clicktogetalertbutton;
	}

	public void setClicktogetalertbutton() {
		this.clicktogetalertbutton = driver.findElement(By.xpath("//input[@id='alert1']"));
	}

	
}
