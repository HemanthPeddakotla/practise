package chinniSir;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1);	// Here nothing will be printed as we haven't assigned anything to StringBuilder
		StringBuilder sb2=new StringBuilder("Bengaluru");
		System.out.println(sb2);
		String s1="Karnataka";
		StringBuilder sb3=new StringBuilder(s1);
		System.out.println(sb3);
		
		//It is a normal String we can use + to concat 2 Strings
		s1=s1+" is a state";
		
		//To concat 2 strings in String builder we use append method
		sb3.append(" is a state");
		
		//reverse() is used to reverse the entire string
		//sb3.append(" is a state").reverse();
		System.out.println(sb3);
		

	}

}
