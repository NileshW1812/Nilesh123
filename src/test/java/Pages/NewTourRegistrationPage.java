package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTourRegistrationPage {
	WebDriver driver;
	WebElement firstname;
	WebElement lastname;
	WebElement phone;
	WebElement email;

	public NewTourRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement firstname() {
		firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		return firstname;
	}

	public WebElement lastname() {
		lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		return lastname;
	}

	public WebElement phone() {
		phone = driver.findElement(By.xpath("//input[@name='phone']"));
		return phone;
	}

	public WebElement email() {
		email = driver.findElement(By.id("userName"));
		return email;
	}
}
