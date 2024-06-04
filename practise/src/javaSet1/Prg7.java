package javaSet1;

public class Prg7 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			if(i==5 || i==8) {
				for(int j=1;j<5;j++) {
					System.out.print(i+" ");
				}
			}
			System.out.print(i+" ");
		}
	}

}
