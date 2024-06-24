package practise;

public class A11{

	public static void main(String[] args) {
		//Even number logic
	  /*  int val=12;
		if(val%2==0) {
			System.out.println(val+" is a even Number");
		}
		else {
			System.out.println(val+" is a odd number");
		}	
		
		//Odd number logic
		if(val%2!=0) {
			System.out.println(val+" is a Odd number");
		}
		else {
			System.out.println(val+" is a Even number");
		}	*/
		
		//Reverse a particular word in a String
		String s="I am From Andhra Pradesh";
		String output="";
		String s2[]=s.split(" ");
		for(int i=0;i<s2.length;i++) {
			String dummy=s2[i];
			if(dummy.equals("Andhra")) {
				output=output+reverse(dummy)+" ";
			}
			else {
				output=output+dummy+" ";
			}
		}
		System.out.println(output);
		
	}
	public static String reverse(String val) {
		String word="";
		for(int j=0;j<val.length();j++) {
			word=val.charAt(j)+word;
		}
		return word;
	}
}
