package practise;

public class Prime_Number_between_Range {

	public static void main(String[] args) {
		
		//Prime number between range
				for(int i=30;i<=100;i++) {
					boolean b=true;
					for(int j=2;j<i;j++) {
						if(i%j==0) {
							b=false;
							break;
						}
					}
					if(b==true) {
						System.out.println(i+" is a prime number");
					}
			}
		
		
		//Reversing a particular word in a String
	/*	String s="One love for the mother's pride";
		String s2[]=s.split(" ");
		String outputValue="";
		for(int i=0;i<s2.length;i++) {
			String dummy=s2[i];
			if(dummy.equalsIgnoreCase("One")) {
				outputValue=outputValue+reverse(dummy)+" ";
			}
			else {
				outputValue=outputValue+dummy+" ";
			}
		}
		System.out.println(outputValue);
	}
	public static String reverse(String value) {
		String abnormal="";
		for(int j=0;j<value.length();j++) {
			abnormal=value.charAt(j)+abnormal;
		}
		return abnormal;	*/
	}
}
