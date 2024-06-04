package sony_interview;

public class Count_no_of_characters_in_a_String {

	public static void main(String[] args) {
		// number of alphabets in a String
	/*	String s = "java programming";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				count++;
			}
		}
		System.out.println("Number of alphabets in a String is : "+count);  */
		
		
		// number of characters in a String
		String sr = "java programming";
		int count =0;
		for(int i=0;i<sr.length();i++) {
			count++;
		}
		System.out.println("Number of characters in the string is : "+count);

	}

}
