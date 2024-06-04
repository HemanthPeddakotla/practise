package selenium2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Hemanth
 *
 */

public class Login_to_FB_by_reading_data_from_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Method to read data from excel
				File file = new File("C:\\Users\\Hemanth\\eclipse-workspace\\practise\\externalFolders\\SampleData.xlsx");
				FileInputStream fis = new FileInputStream(file);
				Workbook workbook = WorkbookFactory.create(fis);
				
		//Expected result
				String mobileNumber = workbook.getSheet("Sheet5").getRow(3).getCell(0).toString();
				//System.out.println(mobileNumber);
				String password = workbook.getSheet("Sheet5").getRow(4).getCell(0).toString();
				String expectedHomePageTitle = workbook.getSheet("Sheet5").getRow(2).getCell(0).toString();
				String expectedLoginPageTitle = workbook.getSheet("Sheet5").getRow(5).getCell(0).toString();
		
		//Step 1 : Navigating to application
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		if(expectedLoginPageTitle.equals(driver.getTitle())) {
			System.out.println("Login page is displayed");
		}
		else {
			System.out.println("Login page is not displayed");	
		}
		
		//Step 2 : Enter valid credentials
		WebElement mobileNumberTextBox = driver.findElement(By.id("email"));
		mobileNumberTextBox.clear();
		mobileNumberTextBox.sendKeys(mobileNumber);
		if(mobileNumberTextBox.getAttribute("value").equals(mobileNumber)) {
			System.out.println("Mobile number got entered");
		}
		else {
			System.out.println("Mobile number is not entering into text box");	
		}
		
		WebElement passwordTextBox = driver.findElement(By.id("pass"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		//System.out.println(passwordTextBox.getAttribute("value"));
		if(passwordTextBox.getAttribute("value").equals(password)) {
			System.out.println("Password got entered");
		}
		else {
			System.out.println("Password is not entering into text box");
		}
		
		//Step 3 : Clicking on login button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.isDisplayed();
		loginButton.click();
		
		//Validating whether application navigated to Home Page
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page is not displayed");
		}
		
	 	driver.quit();

	}

}
