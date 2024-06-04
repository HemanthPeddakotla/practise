package practise;

public class ConvertionOfaParticularCharacterIntoUppercaseInaString {

	public static void main(String[] args) {
		String s1 = "hemanth";
		String s2 = "";
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch=='h' || ch=='H') {
				String dummy = "";
				dummy=dummy+ch;
				dummy=dummy.toUpperCase();
				s2=s2+dummy;
			}
			else{
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}

}
