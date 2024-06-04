package testNgGroupExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfieldHunter {
	@Test(groups = "streetfighter")
	public void hunter() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.royalenfield.com/in/en/motorcycles/hunter-350/campaign/?utm_source=google&utm_medium=cpc&utm_campaign=j1c_in_mc_brand&utm_content=phrase&utm_term=re%20hunter%20350&gclid=Cj0KCQiAgaGgBhC8ARIsAAAyLfGyzwzy2blwWDs5uwSmHOqktQBAUgJd-iYbbMCVj36S-JrT8HSjdwIaAsfSEALw_wcB");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
