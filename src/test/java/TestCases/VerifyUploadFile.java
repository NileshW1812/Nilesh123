package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MainProgramsMethod1.Utility12;
import Pages.DemoQaPage;

public class VerifyUploadFile extends BaseTest {

	DemoQaPage qapage;

	@Test(priority = -9, groups = { "sanity" }, enabled =false)
	public void VerifyUpoladPage() {
		qapage = new DemoQaPage(driver);

		qapage.uploadfile().sendKeys(
				"C:\\Users\\Asus\\Desktop\\Downloads\\com.myadvance.project\\src\\test\\resources\\resources\\Registration3.xls");
	}

	@Test(priority = -2, groups = { "sanity" }, enabled = false)
	public void VerifyDataPicker() {
		qapage = new DemoQaPage(driver);
		
		Utility12.SelectValueFromDtaepicker(driver, "July", "2023", "11");

	}
	@Test(priority = -4, groups = { "sanity" }, enabled = true)
	public void VerifyDragAndDrop() {
		qapage = new DemoQaPage(driver);
		
		WebElement frame=qapage.DragAndDrop();
		driver.switchTo().frame(frame);
		Actions actions=new Actions(driver);
		actions.dragAndDrop(qapage.drophere(),qapage.draghere()).perform();;
	}
	

}
