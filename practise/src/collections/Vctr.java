package collections;

import java.util.Vector;

public class Vctr {

	public static void main(String[] args) {
		Vector vtr=new Vector();
		vtr.addElement("Eddy");
		vtr.addElement(10);
		vtr.addElement("Pandagowwwwww");
		vtr.removeElementAt(2);
		System.out.println(vtr);
	}

}
