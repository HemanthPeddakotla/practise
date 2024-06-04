package chinniSir;

public class AlternateUpperAndLower {

	public static void main(String[] args) {
		String s="I am from ELF 44&45 Batch";
		//output:- i Am FrOm ElF 44&45 bAtCh
		String res="";
		boolean flag=true;
		
		for (int i = 0; i < s.length(); i++) {
			Character ch=s.charAt(i);
			if (!ch.isAlphabetic(ch)) {
				res=res+ch;
				continue;
			}else if (flag) {
				ch=ch.toLowerCase(ch);
				flag=false;
			}else if (!flag) {
				ch=ch.toUpperCase(ch);
				flag=true;
			}
			res+=ch;
		}
		System.out.println(res);
	}

}
