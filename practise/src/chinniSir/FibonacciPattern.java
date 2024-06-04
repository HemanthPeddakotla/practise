package chinniSir;

public class FibonacciPattern {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
		int a=0;
		int b=1;
		for (int j = 1; j <= i; j++) {
			
			int sum=a+b;
			System.out.print(a+" ");
			a=b;
			b=sum;
	        }
		System.out.println();
       }
	}
}
/*output:-
0 
0 1 
0 1 1 
0 1 1 2 
0 1 1 2 3 
0 1 1 2 3 5 
0 1 1 2 3 5 8 
0 1 1 2 3 5 8 13 
0 1 1 2 3 5 8 13 21 
0 1 1 2 3 5 8 13 21 34       */