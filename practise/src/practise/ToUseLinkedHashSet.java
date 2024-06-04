package practise;

import java.util.LinkedHashSet;

public class ToUseLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet a = new LinkedHashSet();
		a.add(10);
		a.add(56.2);
		a.add(650);
		a.add("hello");
		for(Object obj : a) {
			System.out.println(obj);
		}
	}

}
