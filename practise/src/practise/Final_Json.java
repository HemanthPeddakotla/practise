package practise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Final_Json {
	 static int l=1;
	    public static int itr=1;

	    // Method to generate a random name
	    public static String generateRandomName() {
	        String[] firstNames = generateFirstNames();
	        Random rand = new Random();
	        String firstName = firstNames[rand.nextInt(firstNames.length)];
	        return firstName;
	    }

	    // Method to generate random first names
	    public static String[] generateFirstNames() {
	        // Use the logic from RandomStringGenerator to generate random names
	        String[] randomNames = RandomStringGenerator.generateRandomStrings(10);
	        return randomNames;
	    }

	    // Method to generate a random phone number
	    public static String generateRandomPhoneNumber() {
	        StringBuilder phoneNumber = new StringBuilder();
	        Random rand = new Random();
	        phoneNumber.append("+91 "); // Assuming IND country code
	        for (int i = 0; i < 10; i++) {
	            phoneNumber.append(rand.nextInt(10));
	        }
	        return phoneNumber.toString();
	    }

	    // Method to write name and phone number to a text file
	    public static void writeToFile(String name, String phoneNumber) {
	        try {
	            FileWriter writer = new FileWriter("C:\\Users\\Hemanth\\OneDrive\\Desktop\\Task Folder\\"+l+".txt", true); // Append mode
	            writer.write("{"+"\n"+"\tName : "+name +","+"\n"+"\tPhoneNumber : "+ phoneNumber + "\n"+"}");
	            writer.close();
	            System.out.println("Name and phone number saved to contacts.txt");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }
	    }

	    // Method to generate random names and phone numbers and write them to a file
	    public static void generateAndWriteToFile() {
	        String name = generateRandomName();
	        String phoneNumber = generateRandomPhoneNumber();
	        writeToFile(name, phoneNumber);
	    }

	    public static void main(String[] args) {
	    	while (l <= 5) {
	            for (int i = 0; i < itr; i++) {
	                generateAndWriteToFile();
	            }
	            l++;
	        }  	
	    }
}
