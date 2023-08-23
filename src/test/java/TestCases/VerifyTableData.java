package TestCases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import MainProgramsMethod1.Utility12;
import Pages.HomePage;

public class VerifyTableData extends BaseTest {
	HomePage page;

	@Test(priority = 13, groups = { "sanity" }, enabled = false)
	public void VerifyTableData() {
		page = new HomePage(driver);
		page.TableData();
	}

	@Test(priority = 10, groups = { "sanity" }, enabled = false)
	public void VerifyTableData1() {
		page = new HomePage(driver);
		page.TableData1();
	}

	@Test(priority = 1, groups = { "sanity" }, enabled = true)
	public void VerifyTableData2() {

		ArrayList<String>expectedTableData = new ArrayList<>();
		expectedTableData.add("Kishore");
		expectedTableData.add("22");
		expectedTableData.add("Delhi");
		expectedTableData.add("Manish");
		expectedTableData.add("25");
		expectedTableData.add("Pune");
		expectedTableData.add("Praveen");
		expectedTableData.add("29");
		expectedTableData.add("Bangalore");
		expectedTableData.add("Dheepthi");
		expectedTableData.add("31");
		expectedTableData.add("Mumbai");

		assertEquals(Utility12.getAllTableData(driver, "//table[@id='table1']//tbody//tr//td"), expectedTableData);

	}
}
