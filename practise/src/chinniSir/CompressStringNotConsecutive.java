package chinniSir;

public class CompressStringNotConsecutive {

	public static void main(String[] args) {
		String s="aaaabbbcccda";
		String res="";
		
		for (int i = 0; i < s.length()-1; i++) {
			char ch=s.charAt(i);
			int count=1;
			for (int j = i+1; j < s.length(); j++) {
				if(ch==s.charAt(j))
				count++;
			}
		
		if (res.indexOf(ch)==-1) {
			res=res+ch+count;
		}
	}
		System.out.println(res);
	}
}
 