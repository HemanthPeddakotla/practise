package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello_Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/home");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("hemanthhemu1274@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(passwordTextBox));
		passwordTextBox.sendKeys("Hemanth@95");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[text()='Training']")).click();
		Actions action = new Actions(driver);
		WebElement card = driver.findElement(By.linkText("SDLC"));
		action.moveToElement(card).contextClick().perform();
		WebElement contextMenu = driver.findElement(By.xpath("//div[@data-testid='quick-card-editor-buttons']"));
		System.out.println(contextMenu.getText());
		
		driver.quit();
	}

}
