package practise;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class ToUseHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap();
		hm.put(1, "hi");
		hm.put(2, "hey");
		hm.put(3, "reply");
		hm.put(4, "Busy ah");
		hm.put(5, "Attitude ah");
		hm.put(6, "Ok bye");
		System.out.println(hm);
		hm.put(2, "pandi");
		System.out.println(hm.put(2, "pandi"));
		System.out.println();
		System.out.println(hm.remove(1));
		System.out.println(hm.containsKey(5));
		System.out.println(hm.containsValue("Busy ah"));
		System.out.println();
		hm.put(8," ");
		System.out.println(hm);
		Set s = hm.keySet();
		for(Object obj : s) {
			System.out.println(obj);
			
		
			
		}
		
	}

}
