package yogitha_mam_java_programs;

public class Prg_8_Replace_the_character {

	public static void main(String[] args) {
		String s="my name is mohan and iam from mangalore";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='m') {
				ch='w';
				s2=s2+ch;
			}
			else {
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}

}
