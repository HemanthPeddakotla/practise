package practise2K24;

public class Interchange_Two_Values_of_the_Variables {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//Using third variable
	/*	int c=a;
		a=b;
		b=c;
		System.out.println(a+" : "+b);	*/
		
		//Without using third variable
		b=b-a;
		a=a+b;
		System.out.println(a+" : "+b);

	}

}
