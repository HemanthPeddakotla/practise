package javaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identifying_element_using_JS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement emailTextBox = (WebElement) js.executeScript("return document.getElementById('email');");
		 emailTextBox.sendKeys("Hey Pandagoww");
		 System.out.println(emailTextBox.getAttribute("value"));
		 driver.quit();
		
	}

}
