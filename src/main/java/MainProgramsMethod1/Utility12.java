package MainProgramsMethod1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Utility12 {
	public static WebDriver getDriver() throws IOException {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\Asus\\Desktop\\Downloads\\com.myadvance.project\\src\\test\\resources\\resources\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Asus\\Downloads\\chrome-win64\\chrome-win64\\chrome");
		WebDriver driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(getProperties("url"));
		driver.manage().window().maximize();
		return driver;
	}

	public static String getProperties(String key) throws IOException {
		File file = new File("src\\test\\resources\\resources\\usedata.properties");
		FileInputStream fileinputstream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileinputstream);
		return properties.getProperty(key);
	}

	public static void getScreenshot(WebDriver driver, String name) throws IOException {
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File file = takescreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src\\test\\resources\\Screenshot" + name + ".png"));
	}
	// public static void readExcel()

	public static List<String> readExcel() throws IOException {
		File file = new File("src\\test\\resources\\resources\\Registration3.xls");
		FileInputStream fileInputStream = new FileInputStream(file);

		List<String> userRegistrationDetails = new ArrayList<String>();

		// reading .xls file
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);

		HSSFSheet sheet = hssfWorkbook.getSheetAt(0);

		int lastRowNumer = sheet.getLastRowNum();

		int lastCellNumber = 0;

		for (int i = 1; i <= lastRowNumer; i++) {
			HSSFRow row = sheet.getRow(i);
			lastCellNumber = row.getLastCellNum();
			for (int j = 0; j < lastCellNumber; j++) {
				userRegistrationDetails.add(row.getCell(j).getStringCellValue());
			}
		}
		return userRegistrationDetails;
	}

	public static void SelectValueFromDropdown(WebElement dropdown, String ValuetoSelect) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(ValuetoSelect);
		select.selectByVisibleText(ValuetoSelect);
		select.selectByIndex(0);
	}

	public static void SelectValueFromDtaepicker(WebDriver driver, String month, String year, String date) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		js.executeScript("arguments[0].click()", dob);

		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Utility12.SelectValueFromDropdown(monthDropdown, month);

		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility12.SelectValueFromDropdown(yearDropdown, year);

		List<WebElement> dates = driver
				.findElements(By.xpath("//div[@class='react-datepicker__month-container']//div[@role='option']"));

		for (WebElement date1 : dates) {
			if (date1.getText().contains(date))
				;
			date1.click();
			break;
		}
	}

//Selct options from dropdown

	public static ArrayList<String> selectOptionsOfDropDown(WebElement dropdown1, String[] options) {
		Select select = new Select(dropdown1);

		ArrayList<String> selectedoptions = new ArrayList<>();

		for (String option : options) {
			select.selectByVisibleText(option);
		}
		List<WebElement> selctedoptionsByLogic = select.getAllSelectedOptions();

		for (WebElement elm : selctedoptionsByLogic) {
			selectedoptions.add(elm.getText());
		}
		return selectedoptions;
	}

	public static String switchToNewWindow(WebDriver driver) {
		String currenthandle = driver.getWindowHandle();
		Set<String> allwindowhandle = driver.getWindowHandles();

		for (String handle : allwindowhandle) {
			if (!(handle.equals(currenthandle))) {
				driver.switchTo().window(handle);
			}
		}
		return currenthandle;
	}

	public static void switchToWindow(WebDriver driver, String windowHandle) {
		driver.switchTo().window(windowHandle);
	}

	public static List<WebElement> getAllTableData(WebDriver driver, String table) {

		List<WebElement> tableOptions = driver.findElements(By.xpath(table));
		ArrayList<String> allTabData = new ArrayList<>();

		for (WebElement td : tableOptions) {
			allTabData.add(td.getText());
		}
		return tableOptions;

	}
}
