package yogitha_mam_java_programs;

public class Prg_12_Remove_duplicate_words_from_the_statement {

	public static void main(String[] args) {
		String s="hi hello welcome hello hi bangalore";
		String s2[]=s.split(" ");
		String unique="";
		for(int i=0;i<s2.length;i++) {
			String var=s2[i];
			if(unique.indexOf(var)==-1) {
				unique=unique+var+" ";
			}
		}
		System.out.println(unique);
	}

}
