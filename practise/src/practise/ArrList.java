package practise;
import java.util.ArrayList;
public class ArrList {
	public static void main(String[] args) {
		int sum=0;
		ArrayList arr = new ArrayList();
		arr.add(50);
		arr.add(60);
		arr.add("hello");
		arr.add(90);
		arr.add(true);
		arr.add(88);
		for(Object str : arr) {
			try {
				Integer i = (Integer)str;
				System.out.println(i);
				sum=sum+i;
			}
			catch(Exception e) {
				continue;
			}
		}
		System.out.println(sum);
	}

}



