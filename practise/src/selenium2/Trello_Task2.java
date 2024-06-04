package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello_Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/en/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("user")).sendKeys("hemanthhemu1274@gmail.com");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		wait.until(ExpectedConditions.visibilityOf(passwordTextBox));
		passwordTextBox.sendKeys("Hemanth@95");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[text()='Training']")).click();
		WebElement sourceElement = driver.findElement(By.linkText("Test Execution"));
		WebElement targetElement = driver.findElement(By.xpath("//h2[text()='Selenium']/../../..//button[@data-testid='list-add-card-button']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement);
		driver.quit();

	}

}
