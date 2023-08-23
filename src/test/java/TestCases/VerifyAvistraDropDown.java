package TestCases;

import org.testng.annotations.Test;

import Pages.AvistraPgae;

public class VerifyAvistraDropDown extends BaseTest {

	AvistraPgae page;

	@Test(priority = -2, groups = { "sanity" }, enabled = true)
	public void VerifyCountryDropdown() {
		page = new AvistraPgae(driver);

    	page.allcountrydropdon("France");
		page.allcountrydropdon("Oman");
		page.allcountrydropdon("India");

	}
}
