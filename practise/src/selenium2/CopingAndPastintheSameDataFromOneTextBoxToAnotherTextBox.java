package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopingAndPastintheSameDataFromOneTextBoxToAnotherTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("pass"));
		emailTextBox.clear();
		emailTextBox.sendKeys("Thor the urmula dhora");
		emailTextBox.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		emailTextBox.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		passwordTextBox.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.quit();

	}

}
