package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
		Point emailBoxLoc = emailTextBox.getLocation();
		Point passwordBoxLoc = passwordTextBox.getLocation();
		System.out.println(emailBoxLoc);
		System.out.println(passwordBoxLoc);
		driver.quit();
		
		if(emailBoxLoc.getX()==passwordBoxLoc.getX()) {
			System.out.println("Email and Password text fields are properly aligned to left");
			
		}
		else {
			System.out.println("Text boxes are not aligned properly to left");
		}
	}

}
