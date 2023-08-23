package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.NewTourRegistrationPage;

public class VerifyOmayoPage extends BaseTest {
	HomePage page;
	NewTourRegistrationPage registrationpage;

	@Test(priority = 1, groups = { "sanity" }, enabled = false)
	public void VerifyPageTitle() throws IOException {
		page = new HomePage(driver);
		assertEquals(page.pagetitle().getText(), "omayo (QAFox.com)");
	}

	@Test(priority = 2, groups = { "sanity" }, enabled = false)
	public void VerifyClickAlert() {
		page = new HomePage(driver);
		page.HandleAlert();
	}

	@Test(priority = -5, groups = { "sanity" }, enabled = false)
	public void VerifyGetPromtAlert() {
		page = new HomePage(driver);
		page.prompalert("Nilesh Wankhade");

	}

	@Test(priority = -5, groups = { "sanity" }, enabled = false)
	public void VerifyConfireAlert() {
		page = new HomePage(driver);
		page.HandleConfireAlert();
	}

	@Test(priority = -7, groups = { "sanity" }, enabled = false)
	public void VerifyCheckboxClikable() {

		page = new HomePage(driver);
		WebElement elm = page.bagcheckbox();
		boolean b = page.Clickable(elm);
		System.out.println(b);
		WebElement elm1 = page.bookcheckbox();
		boolean b1 = page.Clickable(elm1);
		System.out.println(b1);
		WebElement elm2 = page.pencheckbox();
		boolean b2 = page.Clickable(elm2);
		System.out.println(b2);
		WebElement elm3 = page.laptopcheckbox();
		boolean b3 = page.Clickable(elm3);
		System.out.println(b3);
	}

	@Test(priority = -2, groups = { "sanity" }, enabled = false)
	public void VerifyCheckboxEnabled() {
		page = new HomePage(driver);
		boolean b = page.bagcheckbox().isDisplayed();
		System.out.println(b);
		boolean b1 = page.laptopcheckbox().isEnabled();
		System.out.println(b1);
		boolean b2 = page.pencheckbox().isSelected();
		System.out.println(b2);
		boolean b3 = page.bookcheckbox().isDisplayed();
		System.out.println(b3);
	}

	@Test(priority = -7, groups = { "sanity" }, enabled = false)
	public void VerifyButtons() {
		page = new HomePage(driver);

		WebElement elm = page.button1();
		boolean b1 = page.Clickable(elm);
		System.out.println(b1);
		WebElement elm1 = page.button2();
		boolean b2 = page.Clickable(elm1);
		System.out.println(b2);
	}

	@Test(priority = 2, groups = { "sanity" }, enabled = false)
	public void VerifyIframe1() {
		page = new HomePage(driver);
		assertNotEquals(page.iframe1().getText(), "navbar-iframe");
	}

	@Test(priority = 5, groups = { "sanity" }, enabled = false)
	public void VerifyAllButtons() {
		page = new HomePage(driver);
		page.allbutons();
	}

	@Test(priority = -7, groups = { "sanity" }, enabled = false)
	public void VerifyAlllinks() {
		page = new HomePage(driver);
		page.alllinks();
	}

	@Test(priority = -3, groups = { "sanity" }, enabled = false)
	public void Verifylogin() {

		page = new HomePage(driver);

		page.Usernametext().sendKeys("9970658059");
		page.passwordtext().sendKeys("nilesh@123");
		page.loginbutton().click();

	}

	@Test(priority = 6, groups = { "sanity" }, enabled = false)
	public void VerifyLogintextClickable() {
		page = new HomePage(driver);

		WebElement elm = page.Usernametext();
		boolean b1 = page.Clickable(elm);
		System.out.println(b1);
		WebElement elm1 = page.passwordtext();
		boolean b2 = page.Clickable(elm1);
		System.out.println(b2);
		WebElement elm3 = page.loginbutton();
		boolean b3 = page.Clickable(elm3);
		System.out.println(b3);
	}

	@Test(priority = 3, groups = { "sanity" }, enabled = false)
	public void VerifyLogintextEnable() {
		page = new HomePage(driver);

		boolean b1 = page.Usernametext().isDisplayed();
		System.out.println(b1);
		boolean b2 = page.passwordtext().isSelected();
		System.out.println(b2);
		boolean b3 = page.loginbutton().isEnabled();
		System.out.println(b3);
	}

	@Test(priority = 7, groups = { "sanity" }, enabled = false)
	public void VerifyPageTitle1() throws IOException {

		page = new HomePage(driver);
		String ExpectedTitle = "omayo (QAFox.com)";

		assertEquals(page.pagetitle().getText(), ExpectedTitle);
	}

	@Test(priority = 9, groups = { "sanity" }, enabled = false)
	public void VerifyPageScrolling() throws InterruptedException {

		JavascriptExecutor javascriptExecuter = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		javascriptExecuter.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		javascriptExecuter.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		javascriptExecuter.executeScript("window.scrollBy(1000,-500)", "");
	}

	@Test(priority = 11, groups = { "sanity" }, enabled = false)
	public void VerifyPageScrollingintoView() throws InterruptedException {
		page = new HomePage(driver);
		JavascriptExecutor javascriptExecuter = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		javascriptExecuter.executeScript("arguments[0].scrollIntoView(true);", page.dropdownbutton());
		Thread.sleep(2000);
	}

	@Test(priority = 5, groups = { "sanity" }, enabled =false)
	public void Verifybutton() throws InterruptedException {
		page = new HomePage(driver);

		JavascriptExecutor javascriptExecuter = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		javascriptExecuter.executeScript("arguments[0].scrollIntoView(true);", page.dropdownbutton());
		Thread.sleep(2000);
		javascriptExecuter.executeScript("arguments[0].click();", page.dropdownbutton());
		Thread.sleep(2000);
	}

	@Test(priority = 2, groups = { "sanity" }, enabled = true)
	public void VerifyScollIntoHeight() throws InterruptedException {
		page = new HomePage(driver);

		JavascriptExecutor javascriptExecuter = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		javascriptExecuter.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
	}
}