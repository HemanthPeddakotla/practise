package file_Handling;

import java.io.File;

public class Creating_a_File {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Hemanth\\OneDrive\\Documents\\Java programs/Hemanth.txt");
		if(file.createNewFile()) {
			System.out.println("New File created");
		}
		else {
			System.out.println("File already exist");
		}

	}

}
