package selenium2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_browsers_as_per_alphabetical_order {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hemanth/Downloads/TestPage.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='button']")).click();

		Thread.sleep(9000);
	    Set<String> allwindowIds = driver.getWindowHandles();
		for(String id : allwindowIds) {
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			driver.close();
		}	 
	}

}
