package yogitha_mam_java_programs;

public class Prg_5_occurance_of_h_in_a_string {

	public static void main(String[] args) {
		int count=0;
		
		String s="hi hello welcome to your home town";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='h') {
				count++;
			}
		}
		if(count>0) {
			System.out.println(count);
		}
	}

}
