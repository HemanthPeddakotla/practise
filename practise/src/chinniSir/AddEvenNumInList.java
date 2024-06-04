package chinniSir;

import java.util.ArrayList;

public class AddEvenNumInList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <=100; i++) {
			if (EvenOrNot(i)) {
				al.add(i);
			}
		}
		System.out.println(al);
	}
    public static boolean EvenOrNot(int num) {
    	if (num%2==0) {
			return true;
		} else {
            return false;
		}
    }
}
