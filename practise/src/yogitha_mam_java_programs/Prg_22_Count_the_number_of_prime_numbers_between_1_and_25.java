package yogitha_mam_java_programs;


public class Prg_22_Count_the_number_of_prime_numbers_between_1_and_25 {

	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<=25;i++) {
			boolean b=true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						b=false;
						break;
					}
				}
				if(b==true) {
					count++;
				}
		}
		System.out.println(count);
		
	}

}
