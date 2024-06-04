package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider{
	
	WebDriver driver=null;
	
	@DataProvider(parallel = true)
	public String[][] multipleData() throws EncryptedDocumentException, IOException{
		File file = new File("C:\\Users\\Hemanth\\eclipse-workspace\\practise\\externalFolders\\registrationDataForDemoWebShop.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet dataSheet = workbook.getSheet("RegDetails");
		int rowCount = dataSheet.getPhysicalNumberOfRows()-1;
		int colCount = dataSheet.getRow(0).getPhysicalNumberOfCells()-1;
		
		String [][]info = new String[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				info[i][j] = dataSheet.getRow(i+1).getCell(j+1).toString();
			}
		}
		return info;
	}
	
	@Test(dataProvider = "multipleData")
	public void readingData(String[] data) throws IOException {
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
