package practise;

public class Program1 {
	
	public static void main(String[] args) {
		int evenCount=0;
		int oddCount=0;
		int a[]= {10,89,54,22,1,3};
		for(int i=0;i<a.length;i++) {
			int var=a[i];
			if(var%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Total number of even numbers present in the array are "+evenCount);
		System.out.println("Total number of odd numbers present in the array are "+oddCount);
	}
}
