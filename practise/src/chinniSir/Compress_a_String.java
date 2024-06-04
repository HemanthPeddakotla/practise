package chinniSir;

public class Compress_a_String {

	public static void main(String[] args) {
		String s="aaabbc";
		String output="";
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			if(output.indexOf(ch)==-1)
			output=output+ch+count;
						
		}
		System.out.println(output);
	}

}
