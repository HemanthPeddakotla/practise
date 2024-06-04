package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleDataFromExcel {
	
	@DataProvider
	public String[][] teams() throws EncryptedDocumentException, IOException{
		File file = new File("C:\\Users\\Hemanth\\eclipse-workspace\\practise\\iplFranchises.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet dataSheet = workbook.getSheet("TeamLinks");
		int row = dataSheet.getPhysicalNumberOfRows()-1;
		int col = dataSheet.getRow(0).getPhysicalNumberOfCells()-1;
		
		String info[][] = new String[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				info[i][j] = dataSheet.getRow(i+1).getCell(j+1).toString();
			}
		}
		return info;	
	}
	
	@Test(dataProvider = "teams")
	public void franchises(String indianFest) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(indianFest);
		driver.quit();
	}
}
