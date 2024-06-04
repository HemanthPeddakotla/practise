package arraysOfObject;

public class ByDeclarationandIntilization {
	String name;
	int rollNo;
	static int count=0;
	ByDeclarationandIntilization(String name,int rollNo){
		count++;
		this.name=name;
		this.rollNo=rollNo;
	}
	public static void main(String[] args) {
		ByDeclarationandIntilization b1 = new ByDeclarationandIntilization("Hemanth",01);
		ByDeclarationandIntilization b2 = new ByDeclarationandIntilization("Bhargav",02);
		
		ByDeclarationandIntilization b[]= {b1,b2};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i].name+" "+b[i].rollNo);
		}
	}

}
