package yogitha_mam_java_programs;

public class Prg_3_Reverse_a_integer {

	public static void main(String[] args) {
		int a=123145;
		int rev=0;
		while(a>0) {
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);

	}

}
