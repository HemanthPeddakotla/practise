package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LnkedLst {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add("Pandagoww");
		list.add(10);
		list.addFirst("Hey");
		list.addLast("Think of the minds iojgfkwepfhg kjg6uq Control");
		System.out.println(list);
		
		//Converting LinkedList into ArrayList
		
		ArrayList arr=new ArrayList(list);
		System.out.println(arr);
	}
}
