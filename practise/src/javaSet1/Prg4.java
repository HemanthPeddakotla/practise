package javaSet1;

public class Prg4 {

	public static void main(String[] args) {
		Prg4 q=new Prg4();
		q.add("hello");
		
	}
	public void add(String d) {
		String c=d;
		int count=0;
		for(int i=1;i<=c.length();i++) {
			count++;
		}
		System.out.println(count);
	}

}
