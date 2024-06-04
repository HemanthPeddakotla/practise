package yogitha_mam_java_programs;

public class Prg_9_occurance_of_each_word {

	public static void main(String[] args) {
		String s="hi hello welcome hello hi bangalore";
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch+" : "+count);
			}
		}

	}

}
