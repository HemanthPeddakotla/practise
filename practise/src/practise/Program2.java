package practise;

public class Program2 {
	
	public static void main(String[] args) {
		int a[]= {23,10,5,484,5,2};
		int var=0;
		int i=0;
		for(i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				var=a[i];
				break;
			}
		}
		for(int j=i;j<a.length;j++) {
			if(a[j]%2==0) {
				if(a[j]<var) {
					var=a[j];
				}
			}
		}
		System.out.println(var);
	}

}



