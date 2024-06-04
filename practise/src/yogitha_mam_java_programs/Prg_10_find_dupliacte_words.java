package yogitha_mam_java_programs;

public class Prg_10_find_dupliacte_words {

	public static void main(String[] args) {
		String s="hi hello welcome hello hi bangalore";
		String word[]=s.split(" ");
		int i=0;
		for( i=0;i<word.length;i++) {
			int count=0;
			String comp=word[i];
			for(int j=i+1;j<word.length-1;j++) {
				if(comp.equals(word[j])) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(word[i]);
			}
		}

	}

}
