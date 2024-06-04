package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/user/login");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("hemanthhemu1274@gmail.com");
		String enteredText = emailTextBox.getAttribute("value");
		System.out.println(enteredText);
		driver.quit();
		
	}

}
