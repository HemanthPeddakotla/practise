package yogitha_mam_java_programs;

public class Prg_19_count_multiples_of_3_from_1_to_25 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=25;i++) {
			if(i%3==0) {
				count++;
			}
		}	
      System.out.println(count);
	}

}
