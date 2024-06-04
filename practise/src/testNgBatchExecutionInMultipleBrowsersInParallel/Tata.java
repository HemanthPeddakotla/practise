package testNgBatchExecutionInMultipleBrowsersInParallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tata {
	@Parameters("browserName")
	@Test 
	public void safari(@Optional("chrome") String bName) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(bName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://cars.tatamotors.com/suv/safari?utm_source=TML_OMD_Search_CTW_Safari_India&utm_medium=Search&utm_campaign=OMD_TML_Safari_AlwaysOn_Feb2023&utm_content=TextAds&gclid=Cj0KCQiAgaGgBhC8ARIsAAAyLfHwE45Jhuz-F5mKiDONaHhhPVqB4uhnp4a1IDzn7efnM_WRJBzCJekaAkwIEALw_wcB");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
