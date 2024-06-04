package chinniSir;

import java.util.Arrays;

public class Anagram {
	//Anagram means both the Strings should contain same characters
	public static void main(String[] args) {
		String s="Race";
		String t="Care";
		if (s.length()!=t.length()) {
			System.out.println("It is not a Anagram");
		}
		else {
			s=s.toLowerCase();
			t=t.toLowerCase();
			
			char []ch1=s.toCharArray();
			char []ch2=t.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			//System.out.println(ch1);
			//System.out.println(ch2);
			boolean val=true;
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]==ch2[i]) {
					continue;
				}
				else {
					System.out.println("Not an anagram");
					val=false;
					break;
				}
			}
			if(val==true) {
				System.out.println("It is a anagram");
			}
		}

	}

}
