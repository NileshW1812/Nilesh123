package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	static WebDriver driver;
	WebElement mutiselectdropdown;
	WebElement pagetitle;
	WebElement ClickToGetAlert;
	String prompalert;
	WebElement confirmalert;
	WebElement pencheckbox;
	WebElement bookcheckbox;
	WebElement laptopcheckbox;
	WebElement bagcheckbox;
	WebElement TableData;
	WebElement TableData1;
	WebElement button1;
	WebElement button2;
	WebElement iframe1;
	WebElement allbutton;
	WebElement alllinks;
	WebElement Usernametext;
	WebElement passwordtext;
	WebElement loginbutton;
	WebElement dropdownbutton;
	WebElement clickOnThisBlogIsCearedForLink;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement mutiselectdropdownlocator() {
		mutiselectdropdown = driver.findElement(By.id("multiselect1"));
		return mutiselectdropdown;
	}

	public WebElement pencheckbox() {
		pencheckbox = driver.findElement(By.xpath("//input[@value='Pen']"));
		return pencheckbox;
	}

	public WebElement bookcheckbox() {
		bookcheckbox = driver.findElement(By.xpath("//input[@value='Book']"));
		return bookcheckbox;
	}

	public WebElement laptopcheckbox() {
		laptopcheckbox = driver.findElement(By.xpath("//input[@value='Laptop']"));
		return laptopcheckbox;
	}

	public WebElement bagcheckbox() {
		bagcheckbox = driver.findElement(By.xpath("//input[@value='Bag']"));
		return bagcheckbox;
	}

	public WebElement pagetitle() {
		pagetitle = driver.findElement(By.xpath("//h1[@class='title']"));
		return pagetitle;
	}

	public WebElement button2() {
		button2 = driver.findElement(By.xpath("//button[@id='but2']"));
		return button2;
	}

	public WebElement button1() {
		button1 = driver.findElement(By.xpath("//button[@id='but1']"));
		return button1;
	}

	public WebElement iframe1() {
		iframe1 = driver.findElement(By.xpath("//iframe[1]"));
		return iframe1;
	}

	public WebElement Usernametext() {
		Usernametext = driver.findElement(By.xpath("//input[@type=\'text\'][1]"));
		return Usernametext;
	}

	public WebElement passwordtext() {
		passwordtext = driver.findElement(By.xpath("//input[@type='password'][1]"));
		return passwordtext;
	}

	public WebElement loginbutton() {
		loginbutton = driver.findElement(By.xpath("//button[@type='button'][1]"));
		return loginbutton;
	}

	public WebElement dropdownbutton() {
		dropdownbutton = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		return dropdownbutton;
	}

	public void clickOnThisBlogIsCearedForLink() {

		try {
			driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		} catch (NoSuchElementException e) {
			System.out.println("Blog is created links locator is not available");
		}
	}

	public List<WebElement> TableData() {
		List<WebElement> TableData = driver.findElements(By.xpath("//table[@id='table1']//thead//tr//th"));
		for (WebElement elm : TableData) {
			System.out.println(elm.getText());
		}
		return TableData;
	}

	public List<WebElement> allbutons() {
		List<WebElement> button = driver.findElements(By.xpath("//button[@type='button']"));
		Iterator<WebElement> it = button.iterator();
		System.out.println(button.size());
		while (it.hasNext()) {
			WebElement elm = it.next();
			System.out.println(elm.getText());
		}
		return button;
	}

	public List<WebElement> alllinks() {

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (WebElement elm : links) {

			System.out.println(elm.getAttribute("href"));
		}

		return links;

	}

	public List<WebElement> TableData1() {
		List<WebElement> TableData1 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td"));
		for (WebElement elm : TableData1) {
			System.out.println(elm.getText());
		}
		return TableData1;
	}

	public String prompalert(String name) {
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys(name);
		alert.accept();
		return prompalert;
	}

	public void HandleAlert() {
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

	public void HandleConfireAlert() {
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
	}

	public boolean Clickable(WebElement elm1) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(elm1));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
