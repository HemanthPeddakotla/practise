package practise;

public class Sorting_an_Array {

	public static void main(String[] args) {
		int temp=0;
		int arr[]= {10,20,78,54,24,06554,4,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}

	}

}
