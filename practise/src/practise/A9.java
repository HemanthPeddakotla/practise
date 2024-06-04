package practise;

public class A9 {

	public static void main(String[] args) {
		String s1 = "I LIVE IN BENGALURU";
		String s2 = "";
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch=='I'||ch=='A') {
				String dummy = "";
				dummy = dummy+ch;
				dummy = dummy.toLowerCase();
				s2 = s2+dummy;
			}
			else {
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}
}
