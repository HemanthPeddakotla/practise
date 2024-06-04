package practise;

public class A12 {

	public static void main(String[] args) {
		String s = "abchftdcandacvde";
		String a ="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(a.indexOf(ch)==-1) {
				a=a+ch;
			}
		}
		System.out.println(a);
	}
}
