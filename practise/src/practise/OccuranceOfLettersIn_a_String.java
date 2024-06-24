package practise;

public class OccuranceOfLettersIn_a_String {

	public static void main(String[] args) {
		String s1 = "hemanth";
		for(char ch='a'; ch<='z'; ch++) {
			int count = 0;
			for(int i=0; i<s1.length();i++) {
				char let = s1.charAt(i);
				if(ch==let) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch+" : "+count);
			}
		}
	}
}
