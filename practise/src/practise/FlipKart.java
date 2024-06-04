package practise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/"); 
		Actions action=new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		action.moveToElement(fashion).perform();
		driver.findElement(By.linkText("Men's T-Shirts")).click();
		WebElement button = driver.findElement(By.linkText("Shopsy"));
		action.moveToElement(button).click().perform();
		Set<String> ids = driver.getWindowHandles();
		for(String id : ids) {
			driver.switchTo().window(id);
		}
	}

}
