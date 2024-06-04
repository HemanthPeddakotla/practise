package chinniSir;

import java.util.Scanner;

public class AddNPrimeNumInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		int index=0;		
		for (int i = 0;index<size; i++) {
			if (isPrime(i)) {
				a[index]=i;
				index++;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static boolean isPrime(int num) {
    	if (num==0||num==1) {
			return false;
		}
    	for (int i = 2; i < num; i++) {
			if (num%i==0) {
				return false;
			}
		}
    	return true;
    }
}

