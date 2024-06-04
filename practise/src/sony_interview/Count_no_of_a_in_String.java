package sony_interview;

public class Count_no_of_a_in_String {

	public static void main(String[] args) {
		String s = "javaaa";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a') {
				count++;
			}
		}
		System.out.println("Number of 'a' present in the string is : "+count);

	}

}
