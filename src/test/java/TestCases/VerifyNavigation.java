package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import MainProgramsMethod1.Utility12;
import Pages.HomePage;
import Pages.Selenium143;

public class VerifyNavigation extends BaseTest {
	HomePage page;
	Selenium143 page143;

	@Test
	public void verifyNavigations() {
		page = new HomePage(driver);
		page143 = new Selenium143(driver);

		page.clickOnThisBlogIsCearedForLink();
		String parentWindowHandle = Utility12.switchToNewWindow(driver);
		assertEquals(page143.getWhatIsSeleniumText(), "What is Selenium?");
		driver.close();
		Utility12.switchToWindow(driver, parentWindowHandle);
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");

	}

}
