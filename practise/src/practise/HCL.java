package practise;

public class HCL {
	public static void main(String[] args){
		//Occurance of each character
	/*	String s="aabbcfdrefdfgfdd";
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			 for(int i=0;i<s.length();i++) {
				 if(ch==s.charAt(i)) {
					 count++;
				 }
			 }
			 if(count>0) {
				 System.out.println(ch+" : "+count);			
		     }
		}	*/
		
		
		//Print characters in a given String
	/*	String s="a136getf88unb0fm";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.print(s.charAt(i));
			}
		}	*/
		
		
		//Fibonacci
	/*	int a=10;
		int b=11;
		int c;
		for(int i=0;i<10;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}	*/
		
		
		
		//Reverse a Particular word in a String
	/*	String s="I live in bangalore";
		String input[]=s.split(" ");
		String output="";
		for(int i=0;i<input.length;i++) {
			String temp=input[i];
			if(temp.equals("bangalore")) {
				output=output+" "+reverse(temp);
			}
			else {
				output=output+temp+" ";
			}
		}
		System.out.println(output); */
		
		
		
		//Swapping of characters
	/*	String s="abcd";
		char ch[]=s.toCharArray();
		char temp=ch[0];
		ch[0]=ch[3];
		ch[3]=temp;
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}	*/
		
		
		
		//Sorting an Array
		int arr[]= {5,10,2,1,55,89,04};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		
		
	} //Main Method closing statement****************************************

	
	/*	public static String reverse(String temp) {

 
		String ret="";
		for(int j=0;j<temp.length();j++) {
			ret=temp.charAt(j)+ret;
		}
		return ret;
	}	*/
	
}
