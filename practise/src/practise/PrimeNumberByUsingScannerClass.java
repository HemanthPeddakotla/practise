package practise;
import java.util.Scanner;
public class PrimeNumberByUsingScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		System.out.println("Enter boolean value");
		boolean b= sc.hasNext();
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		
	}
}
