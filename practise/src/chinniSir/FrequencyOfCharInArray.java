package chinniSir;

import java.util.LinkedHashMap;

public class FrequencyOfCharInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,1,2,3,4,3,5};
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
        	int a=arr[i];
			if (lhm.containsKey(a)) {
				lhm.put(a,lhm.get(a)+1);
			} else {
                lhm.put(a,1);
			}
		}
       System.out.println(lhm);
	}

}

/*output:-{1=2, 2=2, 3=2, 4=1, 5=1}
   length()---str
   containsKey(key)
   put(key,value)
   get(key)---gives the value of key
*/
