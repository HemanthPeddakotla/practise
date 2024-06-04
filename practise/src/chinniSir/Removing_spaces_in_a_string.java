package chinniSir;

public class Removing_spaces_in_a_string {

	public static void main(String[] args) {
		//Remove only the spaces which are present at first and last without using trim method
		String s=" Hey enjoy panagoww   ";
		String output="";
		int start=0;
		int end=s.length()-1;
		while(start<=end) {
			if(s.charAt(start)==' ') {
				start++;
			}
			else {
				break;
			}
		}
		while(end>=start) {
			if(s.charAt(end)==' ') {
				end--;
			}
			else {
				break;
			}
		}
		output=s.substring(start,end+1);	
		System.out.println(output);
	}

}
