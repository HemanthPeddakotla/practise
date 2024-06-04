package practise;

public class A3 {

	public static void main(String[] args) {
		int var=1234;
		int revNum=0;
		while(var>0) {
			int rem=var%10;
			revNum=revNum*10+rem;
			var=var/10;
			
		}
		
	System.out.println(revNum);  
		}

}

