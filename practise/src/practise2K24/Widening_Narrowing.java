package practise2K24;

public class Widening_Narrowing {

	public static void main(String[] args) {
	/*	char ch='1';
		int a=ch;//Widening
		
		int b=56;
		char c=(char)b;//Narrowing
		
		System.out.println(a);
		System.out.println(c);	*/
		
		double d=1.5;
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.print((int)d+" ");//Narrowing
				d++;
			}
			System.out.println();
		}
	}	
  
}
