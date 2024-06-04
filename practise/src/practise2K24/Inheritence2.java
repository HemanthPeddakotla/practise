package practise2K24;

public class Inheritence2 extends Inheritence1{
	int c=50;
	int d=80;

	public static void main(String[] args) {
		Inheritence1 refvar1=new Inheritence1();
		Inheritence2 refvar2=new Inheritence2();
	//	refvar1=refvar2;//upcasting
		System.out.println(refvar1.a);
		refvar1=new Inheritence2();//upcasting
		
		
		Inheritence2 refvar3=(Inheritence2)refvar1;//Downcasting
		System.out.println(refvar3.c);
		
	}

}
