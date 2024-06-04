package practise2K24;

public class Removing_duplicates_from_the_String {
	public static void main(String[] args) {
		String s="java";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(s2.indexOf(ch)==-1) {
				s2=s2+ch+"";
			}
		}
		System.out.println(s2);
	}
}
