package practise;

public class A12 {

	public static void main(String[] args) {
		//Reverse every word along with it's position
		String s="I am staying in benguluru";
		String value[]=s.split(" ");
		String output="";
		for(int i=0;i<value.length;i++) {
			String temp=value[i];
			output=reverse(temp)+" "+output;
		}
		System.out.println(output);
	}
	public static String reverse(String temp) {
		
		String v="";
		for(int j=0;j<temp.length();j++) {
			v=temp.charAt(j)+v;
		}
		return v;
	}
}
