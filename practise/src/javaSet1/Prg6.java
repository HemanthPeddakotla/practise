package javaSet1;

public class Prg6 {

	public static void main(String[] args) {
		String s1="MALAYALAM";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println(s2+" is a Palindrome");
		}
		else {
			System.out.println(s2+" is not a Palindrome");
		}
	}
}
