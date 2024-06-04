package java_practise;

public class Print_only_number_from_String {
	
	public static void main(String[] args) {
		String s = "AB2D5623";
			String numbers="";
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
					if(ch>='0' && ch<='9') {
						numbers=numbers+ch+"";
					}	
			}
			System.out.println(numbers);
	}

}
