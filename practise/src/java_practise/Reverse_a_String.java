package java_practise;

public class Reverse_a_String {

	public static void main(String[] args) {
		String s = "TestYantra";
		String s2 = "";
			for(int i=s.length()-1;i>=0;i--) {
				s2=s2+s.charAt(i)+"";
			}
			if(s.equals(s2)) {
				System.out.println(s2+" : "+"String is not reversed");
			}
			else {
				System.out.println(s2+" : "+"String is reversed");
			}
	}

}
