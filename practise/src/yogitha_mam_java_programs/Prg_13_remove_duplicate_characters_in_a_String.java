package yogitha_mam_java_programs;

import java.util.Scanner;

public class Prg_13_remove_duplicate_characters_in_a_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(s2.indexOf(ch)==-1) {
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
