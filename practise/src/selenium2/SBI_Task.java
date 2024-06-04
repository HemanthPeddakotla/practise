package selenium2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBI_Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.linkText("Forgot Username / Login Password")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id : allWindowIds) {
			driver.switchTo().window(id);
		}
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		Dimension set = new Dimension(height+100,width+100);
		driver.manage().window().setSize(set);
		
		
		driver.findElement(By.id("nextStep")).click();
		WebElement submitButton = driver.findElement(By.name("Submit"));
		submitButton.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.id("userName")).sendKeys("Pangagoww");
		submitButton.click();
		System.out.println(alert.getText());
		alert.accept();
	    WebElement accountNumTextBox = driver.findElement(By.id("accountNo"));
	    accountNumTextBox.sendKeys("nek nduku");
		submitButton.click();
		System.out.println(alert.getText());
		alert.accept();
		accountNumTextBox.clear();
		accountNumTextBox.sendKeys("35777285697");
		submitButton.click();
		System.out.println(alert.getText());
		alert.accept();
		WebElement dropDown = driver.findElement(By.id("selCountry"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("India");
		submitButton.click();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.id("mobileNo")).sendKeys("8074901045");
		submitButton.click();
		System.out.println(alert.getText());
		alert.accept();
		WebElement dateTextBox = driver.findElement(By.id("datepicker5"));
		dateTextBox.sendKeys("03/13/2000");
		submitButton.click();
		System.out.println(alert.getText());
		alert.accept();
		dateTextBox.clear();
		dateTextBox.sendKeys("09/02/2000");
		submitButton.click();
		System.out.println(alert.getText());
		alert.accept();
	}

}
