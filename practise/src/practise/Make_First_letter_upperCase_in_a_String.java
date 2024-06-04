package practise;

public class Make_First_letter_upperCase_in_a_String {

	public static void main(String[] args) {
		String s="Java is a Programming language";
		String s2[]=s.split(" ");
		String output="";
		for(int i=0;i<s2.length;i++) {
			String dummy=s2[i];
			output=output+dummy.substring(0,1).toUpperCase();
			output=output+dummy.substring(1)+" ";
			//output=output.trim();
		}
		System.out.println(output);
	}
}
