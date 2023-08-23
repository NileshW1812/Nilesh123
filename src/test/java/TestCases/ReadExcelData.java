package TestCases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import MainProgramsMethod1.Utility12;
import Pages.NewTourRegistrationPage;

public class ReadExcelData extends BaseTest {

	NewTourRegistrationPage registrationpage;

	@Test(priority = -9, groups = { "sanity" }, enabled = true)
	public void VerifyExcelData() throws IOException {

		registrationpage = new NewTourRegistrationPage(driver);

		List<String> userdata = Utility12.readExcel();

		registrationpage.firstname().sendKeys(userdata.get(0));
		registrationpage.lastname().sendKeys(userdata.get(1));
		registrationpage.phone().sendKeys(userdata.get(2));
		registrationpage.email().sendKeys(userdata.get(3));
	}

	@Test(dataProvider = "registration", priority = -5, groups = { "sanity" }, enabled = true)
	public void VerifyDataProviderUsingExcels(String firstname, String lastname, String phone, String email) {
		registrationpage = new NewTourRegistrationPage(driver);
		
		registrationpage.firstname().sendKeys(firstname);
		registrationpage.lastname().sendKeys(lastname);
		registrationpage.phone().sendKeys(phone);
		registrationpage.email().sendKeys(email);
	}
	@DataProvider(name = "registration")
	public String[][] registrationUsingDataProvider() throws IOException {
		List<String> data = Utility12.readExcel();
		String[][] registration1 = new String[1][4];
		for (int i = 0; i < data.size(); i++) {
			registration1[0][i] = data.get(i);
		}
		return registration1;

	}

}
