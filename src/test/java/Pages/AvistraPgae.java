package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvistraPgae {
	WebDriver driver;
	WebElement Countrydropdown;

	public AvistraPgae(WebDriver driver) {
		this.driver = driver;
	}

	public void allcountrydropdon(String allcountryname) {
		
		driver.findElement(By.xpath("//div[@class='dropdown country_flag_dropdown']")).click();

		List<WebElement> country = driver.findElements(By.xpath("//div[@class='country-selection dropdown-list']//ul"));

		for (WebElement allcounrty : country) {
			if (allcounrty.getText().equalsIgnoreCase(allcountryname))
				;
			allcounrty.click();
		}

	}
}
