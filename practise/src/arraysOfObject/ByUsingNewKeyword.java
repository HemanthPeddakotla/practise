package arraysOfObject;

public class ByUsingNewKeyword {
	String name;
	int rollNo;
	static int count=0;
	ByUsingNewKeyword(String name,int rollNo){
		count++;
		this.name=name;
		this.rollNo=rollNo;
	}
	public static void main(String[] args) {
	ByUsingNewKeyword b1 = new ByUsingNewKeyword("Hemanth",01);
	ByUsingNewKeyword b2 = new ByUsingNewKeyword("Bhargav",02);
	ByUsingNewKeyword b3 = new ByUsingNewKeyword("Prasad",03);
	ByUsingNewKeyword b4 = new ByUsingNewKeyword("Baba",04);
	
	ByUsingNewKeyword b[] = new ByUsingNewKeyword[count];
	b[0] = b1;
	b[1] = b2;
	b[2] = b3;
	b[3] = b4;
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i].name+" "+b[i].rollNo);
	}
	}
}
