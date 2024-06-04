package testNgGroupExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfiledHimalayan {
	@Test(groups = "adventure")
	public void himalayan() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.royalenfield.com/in/en/motorcycles/himalayan/campaign/?utm_source=google&utm_medium=cpc&utm_campaign=d3g2_in_mc_himalayan&utm_content=phrase&utm_term=re%20himalayan&gclid=Cj0KCQiAgaGgBhC8ARIsAAAyLfEjxbbM1UDFcTDtOLf6FnHM6uiichsZ9Ou0bB3ik4g-rv3OBQ6hppMaAji1EALw_wcB");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
