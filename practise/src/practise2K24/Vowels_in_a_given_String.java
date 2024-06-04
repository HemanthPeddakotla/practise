package practise2K24;

public class Vowels_in_a_given_String {

	public static void main(String[] args) {
		String s= "abcuyhvda";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				s2=s2+ch;
			}
		}
		System.out.println(s2);	
	}

}
