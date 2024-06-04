package selenium2;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender_popUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Close Message']")));
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		LocalDateTime ldt = LocalDateTime.now();
		String month = ldt.getMonth().name();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();
		month=""+month.substring(0, 1).toUpperCase()+month.substring(1).toLowerCase();
		
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+(year+1)+"']/..//span[text()='"+(day-2)+"']")).click();
				driver.findElement(By.xpath("//div[text()='"+month+" "+(year+1)+"']/..//span[text()='"+(day-1)+"']")).click();
				break;
			}
			catch(NoSuchElementException e){
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
		driver.quit();
	}

}
