package TestCases;

import org.testng.annotations.Test;

import Pages.DemoQaPage;

public class VerifyDemoQaAlerts extends BaseTest {
	DemoQaPage page;

	@Test(priority = 1, groups = { "sanity" }, enabled = false)
	public void VerifyClickAlert1() {
		page = new DemoQaPage(driver);
		page.alert1();
	}

	@Test(priority = -5, groups = { "sanity" }, enabled = false)
	public void VerifyTimerAlert2() {
		page = new DemoQaPage(driver);
		page.alert2();
	}

	@Test(priority = 3, groups = { "sanity" }, enabled = false)
	public void VerifyAlert3() {
		page = new DemoQaPage(driver);
		page.alert3();
	}

	@Test(priority = -1, groups = { "sanity" }, enabled = true)
	public void VerifyPromptAlert4() {
		page = new DemoQaPage(driver);
		page.alert4("Nilesh Wankhade");
	}

}
