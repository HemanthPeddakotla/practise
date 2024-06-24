package practise;

public class Remove_Duplicates_in_a_String {

	public static void main(String[] args) {
		String s= "aabsygdccctjkkr";
		String output="";
			
		for(int i=0;i<s.length();i++) {
			String temp=s.charAt(i)+"";
			if(output.indexOf(temp)==-1) {
				output=output+s.charAt(i);
			}
		}
		System.out.println(output);
	}

}
