package yogitha_mam_java_programs;

public class Prg_16_find_the_smallest_number_in_an_Array {

	public static void main(String[] args) {
		int []a={28,45,36,87,66,55,99};
		int i=0;
		int var=0;
		for(i=0;i<a.length;i++) {
			var=a[i];
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]<var) {
				var=a[j];
			}
		}
		System.out.println(var);

	}

}
