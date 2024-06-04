package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingDataproviderWhichIsPresentInOtherClass {
	WebDriver driver = null;
	@Test(dataProvider = "multipleData",dataProviderClass = Dataprovider.class)
	public void toRetrieveData(String[]data) throws IOException {
		File file = new File("C:\\Users\\Hemanth\\eclipse-workspace\\practise\\externalFolders\\configurations.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties property = new Properties();
		property.load(fis);
		
		String url = property.getProperty("Url");
		String key = property.getProperty("Key");
		String value = property.getProperty("Value");
		
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-"+data[0])).click();
		driver.findElement(By.id("FirstName")).sendKeys(data[1]);
		driver.findElement(By.id("LastName")).sendKeys(data[2]);
		driver.findElement(By.id("Email")).sendKeys(data[3]);
		driver.findElement(By.id("Password")).sendKeys(data[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[5]);
		
		driver.findElement(By.id("register-button")).click();
		WebDriverWait explicitWait = new WebDriverWait(driver,15);
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[text()='The specified email already exists']")));
		 WebElement errMsg = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));
		 Reporter.log(errMsg.getText(),true);
		driver.quit();
		
		
	}

}
