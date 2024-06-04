package yogitha_mam_java_programs;

public class Prg_6_Dulpicate_characters_in_a_string {

	public static void main(String[] args) {
		String s="my name is mohan and iam from mangalore";
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==ch) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch);
			}
		}
	}

}
