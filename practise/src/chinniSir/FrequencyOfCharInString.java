package chinniSir;

import java.util.LinkedHashMap;

public class FrequencyOfCharInString {

	public static void main(String[] args) {
		String str = "cool boys";
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
			if (lhm.containsKey(str.charAt(i))) {
				lhm.put(str.charAt(i),lhm.get(str.charAt(i))+1);
			} else {
                lhm.put(str.charAt(i),1);
			}
		}
       System.out.println(lhm);
	}

}

/*output:-{c=1, o=3, l=1,  =1, b=1, y=1, s=1}
   length()---str
   containsKey(key)
   put(key,value)
   get(key)---gives the value of key
*/
