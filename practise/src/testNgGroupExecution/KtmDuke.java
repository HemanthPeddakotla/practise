package testNgGroupExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KtmDuke {
	@Test(groups = "streetfighter")
	public void duke200() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.ktmindia.com/ktm-bikes/naked-bike/ktm-200-duke?utm_source=google&utm_medium=cpc&utm_campaign=EDM_Brand_KTM_Duke_Upper_Google_South_Exact&utm_customdetails=Search_Brand&utm_customdetails1=Duke_LeadGen_D2C&utm_customdetails2=Search_Google&gclid=Cj0KCQiAgaGgBhC8ARIsAAAyLfF7dOU3Hsut7XLpgHENzJEE4MkQhPqx0SQD_6XyCX5LlS0bLGr5zSAaAvDZEALw_wcB");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
