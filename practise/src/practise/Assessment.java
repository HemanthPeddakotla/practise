package practise;

public class Assessment {

	public static void main(String[] args) {
		String Value="122";
		String Actual="";
		for(int i=Value.length()-1;i>=0;i--) {
			Actual=Actual+Value.charAt(i);
		}
		
		if(Value.equals(Actual)) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a plindrome");
		}

	}

}
