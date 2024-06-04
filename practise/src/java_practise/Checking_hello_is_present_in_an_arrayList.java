package java_practise;

import java.util.ArrayList;

public class Checking_hello_is_present_in_an_arrayList {

	public static void main(String[] args) {
	ArrayList list = new ArrayList();
		list.add("hello");
		list.add("hi");
		list.add("bye");
			System.out.println(list.contains("hello"));
	}

}
