package practise;

public class B1 {
	 
	public static void main(String[] args) {
		//Remove spaces from the String
		String s="Java is fun";
		String output="";
	/*	for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				continue;
			}
			else {
				output+=ch;
			}
		}
		System.out.println(output);	*/
		
		 //Remove a particular character in a String
	/*	for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='f' || ch=='F') {
				continue;
			}
			else {
				output+=ch;
			}
		}
		System.out.println(output);	*/
		
		//Reversing the entire string without shifting it's positions
				String dummy="";
				for(int i=s.length()-1;i>=0;i--) {
					 dummy=dummy+s.charAt(i)+"";
				}
				String str[]=dummy.split(" ");
				for(int j=0;j<str.length;j++) {
					output=str[j]+" "+output;
				}
				System.out.println(output);	
	}

}
