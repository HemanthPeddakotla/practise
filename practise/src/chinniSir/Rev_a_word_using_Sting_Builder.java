package chinniSir;

public class Rev_a_word_using_Sting_Builder {

	public static void main(String[] args) {
		String s="I am from bengaluru";
		String s2[]=s.split(" ");
		String finalOutput="";
		for(int i=0;i<s2.length;i++) {
			String dummy=s2[i];
			if(dummy.equals("am")) {
				StringBuilder sb = new StringBuilder(dummy);
				sb.reverse();
				finalOutput=finalOutput+sb+" ";
			}
			else {
				finalOutput=finalOutput+dummy+" ";
			}
		}
		System.out.println(finalOutput);

	}

}
