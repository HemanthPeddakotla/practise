package chinniSir;

public class Fibonacci {

	public static void main(String[] args) {
/*		int a=0;
		int b=1;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a);
			}
			a=a+b;
			System.out.println();
		}	*/
		
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		

	}

}
