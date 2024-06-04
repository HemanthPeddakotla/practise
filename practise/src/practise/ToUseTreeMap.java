package practise;
import java.util.Set;
import java.util.TreeMap;

public class ToUseTreeMap {

	public static void main(String[] args) {
		TreeMap tr = new TreeMap();
		tr.put(10, "hery");
		tr.put(20, 20.025);
		tr.put(30, "ishowSpeed");
		tr.put(90, 'A');
		Set st = tr.entrySet();
		for(Object obj : st) {
			System.out.println(obj);
		}

	}

}
