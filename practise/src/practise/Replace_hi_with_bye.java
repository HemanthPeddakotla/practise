package practise;

public class Replace_hi_with_bye {

	public static void main(String[] args) {
		String s1 = "hi bye hiu hi lh bye ";
		String s2[] = s1.split(" ");
		String dummy ="";
		for( int i=0;i<s2.length;i++) {
			String var = s2[i];
			if(var.equals("hi")) {
				var = "bye";
				dummy = dummy+var+" ";
				
			}
			else {
				dummy = dummy+var+" ";
			}
		}
		System.out.println(dummy);

	}

}
