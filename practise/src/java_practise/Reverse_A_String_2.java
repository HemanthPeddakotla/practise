package java_practise;

public class Reverse_A_String_2 {
	public static void main(String[] args) {
		String s1="hello java";
		String s2="";
		String s3[]=s1.split(" ");
		for(int i=0;i<s3.length;i++) {
			String word=" "+s3[i];
			for(int j=word.length()-1;j>=0;j--) {
				s2=s2+word.charAt(j);
			}
		}
		System.out.println(s2);
		
		
	}
	
	
}
