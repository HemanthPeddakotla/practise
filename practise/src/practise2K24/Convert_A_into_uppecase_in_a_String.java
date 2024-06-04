package practise2K24;

public class Convert_A_into_uppecase_in_a_String {
	
	public static void main(String[] args) {
		String s="Hello My name is Ram";
		String s2[]=s.split(" ");
		for(int i=0;i<s2.length;i++) {
			String s4=" "+s2[i];
			//System.out.println(s4);
			for(int j=s4.length()-1;j>=0;j--) {
				char ch=s4.charAt(j);
				String s5=ch+"";
				System.out.print(s5);
			}
		}	
	}
}
