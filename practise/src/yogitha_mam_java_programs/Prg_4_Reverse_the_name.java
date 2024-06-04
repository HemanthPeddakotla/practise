package yogitha_mam_java_programs;

public class Prg_4_Reverse_the_name {

	public static void main(String[] args) {
		String s="My name is Hemanth";
		String s2[]=s.split(" ");
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}

	}

}
