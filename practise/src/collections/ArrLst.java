package collections;

import java.util.ArrayList;

public class ArrLst {

	public static void main(String[] args) {
	/*	ArrayList arr=new ArrayList();
		arr.add(10);
		arr.add("Pandagoww");
		ArrayList arr2=new ArrayList(arr);
		arr2.add(50);
		System.out.println(arr2);
		System.out.println(arr2.get(1));
		System.out.println(arr2.containsAll(arr));	*/
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(50);
		a1.add(22);
		a1.add(78);
		a1.add(31);
		a1.add(51);
		ArrayList a2=new ArrayList();
		for(Integer var : a1) {
			if(var%2==0) {
				a2.add(var);
			}
		}		
			System.out.println(a2);
	}

}
