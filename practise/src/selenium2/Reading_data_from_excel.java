package selenium2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_data_from_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\Hemanth\\eclipse-workspace\\practise\\externalFolders\\SampleData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		String value1 = workbook.getSheet("Sheet1").getRow(15).getCell(5).toString();
		String value2 = workbook.getSheet("Sheet2").getRow(15).getCell(3).getStringCellValue();
		boolean value3 = workbook.getSheet("Sheet3").getRow(18).getCell(4).getBooleanCellValue();
		String value4 = workbook.getSheet("Sheet4").getRow(12).getCell(3).toString();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);	
	
		

	}

}
