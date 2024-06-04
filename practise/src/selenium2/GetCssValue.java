package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//label[text()='Email Field Is Required']"));
		System.out.println(errorMsg.getText());
		System.out.println(errorMsg.getCssValue("color")); 		
		driver.quit();

	}

}
