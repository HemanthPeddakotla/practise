package java_practise;

public class Prime_numbers_from_an_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
			for(int i=0;i<a.length;i++) {
				boolean b = true;
					int c=a[i];
						for(int j=2;j<c;j++) {
							if(c%j==0) {
								b=false;
								break;
							}
						}
						if(b==true) {
							System.out.println(c+" : "+"is a prime number");
						}
						else {
							System.out.println(c+" : "+"is not a prime number");
						}
			}
	}

}
