package yogitha_mam_java_programs;

public class Prg_21_Check_whether_the_given_number_is_palindrome {

	public static void main(String[] args) {
		int number=1234321;
		int temp=number;
		int rev=0;
		while(number>0) {
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		if(temp==rev) {
			System.out.println("Given number is a Palindrome");
		}
		else {
			System.out.println("Given number is not a Palindrome");
		}
	}

}
