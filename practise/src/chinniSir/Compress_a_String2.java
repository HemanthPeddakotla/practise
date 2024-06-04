package chinniSir;

public class Compress_a_String2 {

	public static void main(String[] args) {
		String s="a4b3c2";
		String output="";
		for(int i=0;i<s.length();i++) {
			Character ch=s.charAt(i);
			if(ch.isDigit(ch)) {
				int num=ch.getNumericValue(ch);
				for(int j=1;j<=num;j++) {
					output=output+s.charAt(i-1);
				}
			}
		}
		System.out.println(output);
	}
}
