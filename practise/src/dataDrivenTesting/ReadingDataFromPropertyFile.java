package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Hemanth\\eclipse-workspace\\practise\\externalFolders\\configurations.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties property = new Properties();
		property.load(fis);
		
		String key = property.getProperty("Key"); 
		String value = property.getProperty("Value");
		String url = property.getProperty("Url");
		String email = property.getProperty("Email");
		String pwd = property.getProperty("Password");
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement enteredEmail = driver.findElement(By.id("Email"));
		enteredEmail.sendKeys(email);
		enteredEmail.getAttribute(email);
		WebElement enteredPassword = driver.findElement(By.id("Password"));
		enteredPassword.sendKeys(pwd);
		enteredPassword.getAttribute(pwd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();

		driver.quit(); 
	}

}
