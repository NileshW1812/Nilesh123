package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQaPage{
	WebDriver driver;
	WebElement uploadfile;
	WebElement drophere;
	WebElement draghere;

	public DemoQaPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement uploadfile() {
		uploadfile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		return uploadfile();
	}
	public WebElement drophere() {
		drophere=driver.findElement(By.id("droppable"));
		return drophere;
		
	}
	public WebElement draghere() {
		draghere=driver.findElement(By.id("draggable"));
		return draghere;
	}
	public WebElement DragAndDrop() {
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"simpleDropContainer\"]"));
		return frame;
		
	}

}
