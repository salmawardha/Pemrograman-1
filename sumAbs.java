import java.util.stream.IntStream;

public class sumAbs {

    public static void main(String[] args){
        System.out.println("SUM: " + sumAbsVals(new int[] {-1, 2, -4, 6, 9}));
        System.out.println("SUM: " + sumAbsVals(new int[] {-1, -2, -3, 6, 6, 8}));
        System.out.println("SUM: " + sumAbsVals(new int[] {5, 7, -9}));
        System.out.println("SUM: " + sumAbsVals(new int[] {6, 8, 5}));
        System.out.println("SUM: " + sumAbsVals(new int[] {-7, 7, -4, 6, -9, 5}));
    }
    
    private static int sumAbsVals(int[] arr) {
      return IntStream.of(arr).sum();
    }
}
