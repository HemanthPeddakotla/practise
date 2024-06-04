package practise2K24;

import java.util.Scanner;

public class Prime_number {

	/*public static void main(String[] args) {
		int num=18;
		boolean b=true;
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
		
	}	*/

/*	public static void main(String[] args) {
		prime();
	}	
	
	public static boolean prime() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int val=sc.nextInt();
		boolean b=true;
		for(int i=2;i<val;i++) {
			if(val%i==0) {
				b=false;
				break;
			}
		}
		if(b==true) {
			return true;
		}
		else {
			return false;
		}
		
	}	*/
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the starting range");
	int a=sc.nextInt();
	System.out.println("Enter the ending range");
	int b=sc.nextInt();
	int sum=0;
	for(int i=a;i<=b;i++) {
		int count=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
	}

}
