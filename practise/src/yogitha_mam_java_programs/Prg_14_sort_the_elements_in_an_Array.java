package yogitha_mam_java_programs;

public class Prg_14_sort_the_elements_in_an_Array {

	public static void main(String[] args) {
		int temp=0;
		int a[]= {10,25,65,89,47,02};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
