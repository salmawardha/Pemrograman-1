import java.util.stream.IntStream;

public class largestEve {

public static void main(String[] args) {
   System.out.println("LARGEST EVEN: " + largestEven(new int[]{-5, -1, 12, 10, 2, 8}));
   System.out.println("LARGEST EVEN: " + largestEven(new int[]{1, 4, -3, 6, 26, 7, 8}));
   System.out.println("LARGEST EVEN: " + largestEven(new int[]{5, 20, -9}));
   System.out.println("LARGEST EVEN: " + largestEven(new int[]{-7, 16, 4}));
   System.out.println("LARGEST EVEN: " + largestEven(new int[]{-7, 18, -4, 6, -9, 5}));
   }
private static int largestEven(int[] arr) {
   return IntStream.of(arr).filter(n -> n % 2 == 0).max().getAsInt();
   }
}

