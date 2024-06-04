package testNgGroupExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YamahaMT {
	@Test(groups = "streetfighter")
	public void mt15(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.yamaha-motor-india.com/yamaha-mt-15-ver2.0.html");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
