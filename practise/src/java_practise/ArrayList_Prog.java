package java_practise;

import java.util.ArrayList;

public class ArrayList_Prog {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
			a.add("devara");
			a.add("bro");
			a.add("kushi");
			a.add("adipurush");
			a.add("virupaksha");
			
			ArrayList b = new ArrayList();
				for(String s : a) {
					if(s.contains("a")) {
						b.add(s);
					}
				}
			System.out.println(b);
			
	}

}
