public class ExeNumUnique {
	public static int numUnique(int x, int y, int z) {
    if (x == y && x == z && y == z) {
        return 3;
    } else if (x != y && x != z && y != z) {
        return 1;
    }
    return 2;
}
}