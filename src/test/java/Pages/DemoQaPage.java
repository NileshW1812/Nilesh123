package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQaPage {
	WebDriver driver;
	WebElement uploadfile;
	WebElement drophere;
	WebElement draghere;
	WebElement alert1;
	WebElement alert2;
	WebElement alert3;
	WebElement alert4;

	public DemoQaPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement uploadfile() {
		uploadfile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		return uploadfile();
	}

	public WebElement drophere() {
		drophere = driver.findElement(By.id("droppable"));
		return drophere;

	}

	public WebElement draghere() {
		draghere = driver.findElement(By.id("draggable"));
		return draghere;
	}

	public WebElement DragAndDrop() {
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"simpleDropContainer\"]"));
		return frame;
	}

	public void alert1() {
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

	public void alert2() {
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

	public void alert3() {
		WebElement elm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		JavascriptExecutor javascriptExecuter = (JavascriptExecutor) driver;
		javascriptExecuter.executeScript("arguments[0].click();", elm);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
	}

	public void alert4(String name) {
		WebElement elm2 = driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));
		JavascriptExecutor javascriptExecuter = (JavascriptExecutor) driver;
		javascriptExecuter.executeScript("arguments[0].click();", elm2);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys(name);
		alert.accept();
	}

}
