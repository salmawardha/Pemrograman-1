public class Pow {
	public static void main (String args[]) {
		System.out.println(pow(3,4));
	}
	
	public static int pow (int base, int times) {
		int tmp = 1;
		
		for (int i = 0 ; i < times ; i++ ) {
			tmp = tmp * base;
			
		}
		
		return tmp;
	}
}


