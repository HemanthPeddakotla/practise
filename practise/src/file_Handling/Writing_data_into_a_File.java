package file_Handling;

import java.io.File;
import java.io.FileWriter;

public class Writing_data_into_a_File {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Hemanth\\OneDrive\\Documents\\Java programs/Hemanth.txt");
		System.out.println(file.createNewFile());
		FileWriter fw = new FileWriter(file);
		fw.write("my mind");
		fw.close();
	}

}
