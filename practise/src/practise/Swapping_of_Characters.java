package practise;

public class Swapping_of_Characters {

	public static void main(String[] args) {
	/*	//Swapping characters in a char array
		char ch[]= {'a','b','c','d'};
		char temp=ch[0];
		ch[0]=ch[3];
		ch[3]=temp;
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}	*/
		
		//Swapping characters in a String
		String s="abcd";
		char c[]=s.toCharArray();
		char tem=c[0];
		c[0]=c[3];
		c[3]=tem;
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j]);
		}
		
	}

}
