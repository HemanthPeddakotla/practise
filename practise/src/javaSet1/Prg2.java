package javaSet1;

public class Prg2 {
	public static void main(String[] args) {
		int num = 146;
		int temp = num;
		int sum = 0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			int fact = 1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a Strong number");
		}
		else {
			System.out.println(temp+" is not a Strong number");
		}
	}
}
