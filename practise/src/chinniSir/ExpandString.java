package chinniSir;

public class ExpandString {

	public static void main(String[] args) {
		String s="a3b2c1d2";
		String res="";
		for (int i = 0; i < s.length(); i++) {
			Character ch=s.charAt(i);
			if (ch.isDigit(ch)) {
				int num=ch.getNumericValue(ch);//converts char into num directly
				for (int j = 0; j < num; j++) {
					//System.out.print(s.charAt(i-1));
					res+=s.charAt(i-1);
				}
			}
		}
		System.out.println(res);
	}

}
