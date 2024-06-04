package practise;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class ToUseTreeSetMethod {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(20);
		ts.add(3);
		ts.add(00);
		ts.add(89530);
		for(Object obj : ts) {
			System.out.println(obj);
		}
		System.out.println();
		TreeSet ap = new TreeSet();
		ap.add(20.3);
		ap.add(10.64);
		ap.add(489.58548);
		ap.add(89768.654);
		for(Object obj : ap) {
			System.out.println(obj);
		}
		
	}

}
