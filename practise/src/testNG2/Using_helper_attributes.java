package testNG2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_helper_attributes {

	@Test(priority=-1,invocationCount=2,threadPoolSize=2)
	public void re() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.royalenfield.com/in/en/home/");
		driver.findElement(By.id("close-gdpr")).click();
		Reporter.log("Royal Enfield page is displayed", true);
		driver.quit();
	}
	
	@Test
	public void ktm() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM page is displayed", true);
		driver.quit();
	}
	
	@Test
	public void yezdi() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.yezdi.com/motorcycles/yezdi-adventure");
		Reporter.log("Yezdi page is displayed", true);
		driver.quit();
	}

}
