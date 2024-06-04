package practise;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char ch[]=new char[size];
		System.out.println("Enter "+size+" characters");
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='A') {
				count++;
			}
		}
		System.out.println("The number of A's present in array are "+count);
	}

}
