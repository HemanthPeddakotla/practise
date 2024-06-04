package file_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class All_operations_of_fileHandling {

	public static void main(String[] args) throws IOException {
		//Creating a File
		File file=new File("C:\\Users\\Hemanth\\OneDrive\\Documents\\Java programs/FileHandling.txt");
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File already exist");
		}
		
		//Writing into File
		FileWriter fw=new FileWriter(file);
		fw.write("All hail the Tiger"+"\t");
		fw.write("One love for the mother's pride");
		fw.close();
		
		//Reading data from the File
		Scanner sc=new Scanner(file);
		System.out.println(sc.nextLine());
		
	}

}
