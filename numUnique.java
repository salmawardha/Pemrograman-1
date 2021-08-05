public class numUnique {
	public static void main (String args[]) {
		System.out.println("unique : " + numUnique(18, 3, 4));
		System.out.println("unique : " + numUnique(6, 7, 7));
	}
	
	public static int numUnique(int a , int b, int c) {
		int tmp = 0;
		if (a == b && a == c) {
			tmp = 1;
		}
		else if ( (a == b && b != c) 
		       || (a == c && c != b) 
		       || (b == c && a != c)) {
			tmp = 2;
		}
		else {
			tmp = 3;
		}
		return tmp;
	}
}

