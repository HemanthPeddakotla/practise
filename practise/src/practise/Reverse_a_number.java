package practise;

public class Reverse_a_number {
	public static void main(String[] args) {
		int a=123456;
		int b=0;
		while(a>0) {
			int rem=a%10;
			b=b*10+rem;
			a=a/10;
		}
		System.out.println(b);
	}
	
}
