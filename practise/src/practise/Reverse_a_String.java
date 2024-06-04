package practise;

public class Reverse_a_String {

	public static void main(String[] args) {
		//Reversing the entire string with shifting it's positions
		String s1 = "i live in bangalore";
	/*	String s2[] = s1.split(" ");
		String dummy = "";
		for(int i=s2.length-1;i>=0;i--) {
			dummy=dummy+s2[i]+" ";
		}
		System.out.println(dummy);	*/
		
		
		//Reversing the entire string without shifting it's positions
		String output="";
		String dummy="";
		for(int i=s1.length()-1;i>=0;i--) {
			 dummy=dummy+s1.charAt(i)+"";
		}
		String str[]=dummy.split(" ");
		for(int j=0;j<str.length;j++) {
			output=str[j]+" "+output;
		}
		System.out.println(output);
	}

}
