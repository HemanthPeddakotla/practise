package selenium2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_data_using_2D_array {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\Hemanth\\eclipse-workspace\\practise\\externalFolders\\SampleData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		int rowCount = workbook.getSheet("Sheet6").getPhysicalNumberOfRows();
		int colCount = workbook.getSheet("Sheet6").getRow(0).getPhysicalNumberOfCells();
		
		String val[][]=new String[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				val[i][j]=workbook.getSheet("Sheet6").getRow(i).getCell(j).toString();
			}
		}
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				System.out.print(val[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
