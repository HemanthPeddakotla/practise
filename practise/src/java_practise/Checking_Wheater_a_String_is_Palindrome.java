package java_practise;

public class Checking_Wheater_a_String_is_Palindrome {

	public static void main(String[] args) {
		String s1 = "akka";
		String s2 = "";
			for(int i=s1.length()-1;i>=0;i--) {
				s2=s2+s1.charAt(i)+"";
			}
			if(s1.equals(s2)) {
				System.out.println(s1+" : "+"is a palindrome");
			}
			else {
				System.out.println(s1+" : "+"is not a palindrome");
			}
	}

}
