package practise;

public class Program3 {

	public static void main(String[] args) {
		int a[]= {10,20,41,52,541,1000,5000};
		int i=0;
		for(i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				continue;
			}
			else {
				break;
			}
		}
		if(i==a.length-1) {
			System.out.println("Elements in the array are in Ascending order");
		}
		else {
			System.out.println("Elements in the array are not in Ascending order");
		}
	}

}

