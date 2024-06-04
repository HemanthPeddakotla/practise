package selenium2;

public class Varargs {

	public double action(double... var) {
		double sum=0;
		for(double d : var) {
			sum=sum+d;
		}
		return sum;
	}

}
