package TestCases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import MainProgramsMethod1.Utility12;
import Pages.HomePage;

public class VerifyMutiselectDropdown extends BaseTest {
	HomePage page;

	@Test
	public void verifymultiselctDropdown() {
		page = new HomePage(driver);
		String[] options = { "Audi", "Volvo" };
		ArrayList<String> selectedoptions = Utility12.selectOptionsOfDropDown(page.mutiselectdropdownlocator(),
				options);
		assertEquals(selectedoptions, Arrays.asList("Volvo", "Audi"));
	}

}
