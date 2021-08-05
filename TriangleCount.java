public class TriangleCount {
	public static void main(String[] args) {
		int[] count = new int[100];      // count of ending 2 digits from 00-99

		// process each of the first 10,000 triangle numbers
		for (int i = 1; i <= 10000; i++) {
			int next = i * (i + 1) / 2;
			int digits = next % 100;
			count[digits]++;             // increase tally for the last 2 digits

			if (i % 200 == 0) {
				System.out.print(".");   // print progress dot every 200 numbers
			}
		}
		System.out.println();

		// display count of every possible last two digits from 00-99
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println("count for " + i + " = " + count[i]);
			}
		}
	}
}
