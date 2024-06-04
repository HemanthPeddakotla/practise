package yogitha_mam_java_programs;

public class Prg_11_find_the_duplicate_words_and_number_of_repeation {

	public static void main(String[] args) {
		String s="hi hello welcome hello hi bangalore";
		String value[]=s.split(" ");
		for(int i=0;i<value.length;i++) {
			int count=0;
			String temp=value[i];
				for(int j=i;j<value.length;j++) {
					if(temp.equals(value[j])) {
						count++; 
					}
				}
				if(count>1) {
					System.out.println(temp+" : "+count);
				}
		}

	}

}
