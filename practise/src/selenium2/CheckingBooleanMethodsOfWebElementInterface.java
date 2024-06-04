package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingBooleanMethodsOfWebElementInterface {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/user/login");
		WebElement yesRadioButton = driver.findElement(By.id("usertype_yes"));
		yesRadioButton.click();
		if(yesRadioButton.isSelected()) {
			Thread.sleep(5000);
			driver.findElement(By.id("groupcode")).isDisplayed();
			System.out.println("Group code text box is displayed");
		}
		else {
			System.out.println("Group code text box is not displayed");
		}
		driver.quit();
	}

}
