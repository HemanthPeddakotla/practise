package practise2K24;

import java.util.Scanner;

public class Arrays_by_using_New_Keyword {
	public static void main(String[] args) {
	/*	int a[]=new int[7];
		a[0]=10;
		a[1]=30;
		a[2]=90;
		a[3]=50;
		a[4]=80;
		a[5]=99;
		a[6]=70;
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0) {
				System.out.println(a[i]);
			}
		}	*/
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter the array Values");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		int oddSum=0;
		for(int j=0;j<b.length;j++) {
			if(b[j]%2==1) {
				oddSum=oddSum+b[j];
			}
		}
		System.out.println("Sum of the odd Numbers are : "+oddSum);	*/
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter the array Values");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			int fact=1;
			for(int j=b[i];j>=1;j--) {
				fact=fact*j;
			}
			System.out.println("The factorial of "+b[i]+" is "+fact);
		}	*/
		
/*		int num=12345;
		int temp=num;
		int b=0;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		
		while(temp>0) {
			int a[]=new int[count];
			int rem=temp%10;
			if(rem%2==0) {
				a[b]=rem;
				System.out.println(a[b]);
				b++;
			}
			temp=temp/10;
		}	*/
		
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size=sc.nextInt();
		System.out.println("Enter the Values");
		int a[]=new  int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int j=0;j<a.length;j++) {
			if(a[j]>max) {
				max=a[j];
			}
		}
		System.out.println("The largest value in an array is : "+max);	*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the characters");
		char ch[]=new char[size];
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		int count=0;
		for(int j=0;j<ch.length;j++) {
			if(ch[j]=='a'|| ch[j]=='A') {
				count++;
			}
		}
		if(count>0) {
			System.out.println("A's are "+count);
		}
		else {
			System.out.println("A's are "+count);
		}
	}
}
