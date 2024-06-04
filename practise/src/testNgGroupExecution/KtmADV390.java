package testNgGroupExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KtmADV390 {
	@Test(groups = "adventure")
	public void adv390() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.ktmindia.com/ktm-bikes/travel/ktm-390-adventure?utm_source=google&utm_medium=cpc&utm_campaign=EDM_Brand_KTM_Adventure_Upper_Google_South_Exact&utm_customdetails=Search_Brand&utm_customdetails1=Adv_LeadGen_D2C&utm_customdetails2=Search_Google&gclid=Cj0KCQiAgaGgBhC8ARIsAAAyLfEAQ8a8uhdtpCbIiqhR4oDZHEK9OErpHsX1ilA1ZGVhiV0ZDkv-hBMaAgr6EALw_wcB");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
