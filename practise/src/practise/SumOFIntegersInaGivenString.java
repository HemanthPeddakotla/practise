package practise;

public class SumOFIntegersInaGivenString {
/*
 output=10+123+12=145
 */
	public static void main(String[] args) {
		String s="10AB123#Bc12A";
		String s1 ="";
		Integer sum = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				s1 = s1 + s.charAt(i);	
			}
			else if (s1!=""){
				sum += Integer.parseInt(s1);	
				s1="";
			}	
		}
		System.out.println(sum);
	}
}
