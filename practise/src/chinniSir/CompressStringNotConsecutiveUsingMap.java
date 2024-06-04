package chinniSir;

import java.util.HashMap;
import java.util.Map.Entry;

public class CompressStringNotConsecutiveUsingMap {

	public static void main(String[] args) {
		String s="aaaabbbcccda";
		int count=1;
		HashMap<Character,Integer> hm=new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (!(hm.containsKey(ch))) {
				hm.put(ch,count);
			} else {
                hm.put(ch,hm.get(ch)+1);
			}
		}
		//System.out.println(hm);
		for(Entry<Character,Integer> data:hm.entrySet()) {
			System.out.print(data.getKey());
			System.out.print(data.getValue());
		}
	}

}
 