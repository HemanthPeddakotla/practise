package practise;

public class Reverse_a_Particular_word_in_a_String {
	//i live in bangalore
	// O/P = i live in erolagnab
	public static void main(String[] args) {
		String s1 = "i live in bangalore karnataka";
		String s2[] = s1.split(" ");
		String rev ="";
		for(int i=0;i<s2.length;i++) {
			String var = s2[i];
			if(var.equals("bangalore")) {
				rev = rev+" "+reverse(var);
			}
			else {
				rev=rev+" "+var;
			}
		}
		System.out.println(rev);
	}
	public static String reverse(String s1) {
		String rev="";
		for(int i=0;i<s1.length();i++) {
			rev = s1.charAt(i)+rev;
		}
		return rev;
	}

}
