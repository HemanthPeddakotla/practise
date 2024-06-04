package practise;

import java.util.ArrayList;

public class B2 {
	public static void main(String[] args) {
		String a="aabbcgdfdfsgerg";
		for(char ch='a';ch<='z';ch++){
			int count=0;
			for(int i=0;i<a.length();i++){
				char letter = a.charAt(i);
					if(ch==letter){
						count++;
					}
			}
		if(count>0){
			System.out.println(ch+" : "+count);
		}
	   }   
	/*	String s="";
		String c="";
	ArrayList<String> a = new ArrayList();
		a.add("java");
		a.add("apti");
		a.add("manual");
	for(String b : a){
	c=c+b+" ";	
	}
	for(int i=c.length()-1;i>=0;i--){
		s=s+c.charAt(i)+"";
	}
	System.out.println(s.trim());   */
	}
 }
