package file_Handling;

import java.io.File;

import java.util.Scanner;

public class Reading_data_from_the_File {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Hemanth\\OneDrive\\Documents\\Java programs/Hemanth.txt");
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
	}

}
