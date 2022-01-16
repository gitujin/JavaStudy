package q3;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1 = new int[] {2,4,6,8,10};
		int total = 0;
		
		for(int i = 0; i < Array1.length; i++) {
			total += Array1[i];
		}
		
		System.out.println(total);
	}
}
