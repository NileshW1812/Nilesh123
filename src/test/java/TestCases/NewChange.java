package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Test;

public class NewChange {
	
	@Test
	public void launchUrl() {

//	public static void main(String[] args) {
//
//		ChromeOptions options = new ChromeOptions();
//
//		String browsepath = SeleniumManager.getInstance().getDriverPath(options);
//		String driverpath1 = SeleniumManager.getInstance().getDriverPath(options);
//
//		System.out.println(browsepath);
//		System.out.println(driverpath1);

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\Asus\\Desktop\\Downloads\\com.myadvance.project\\src\\test\\resources\\resources\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("116");
		options.setBinary("C:\\Users\\Asus\\Downloads\\chrome-win64\\chrome-win64\\chrome");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

	}

}
