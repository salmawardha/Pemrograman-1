public class AllDigitsOdd {
    public static void main(String[] args) {
        if (allDigitsOdd(3159)) {
            System.out.println("3159 all odd");
        } else {
            System.out.println("3159 not all odd");
        }

        if (allDigitsOdd(12345)) {
            System.out.println("12345 all odd");
        } else {
            System.out.println("12345 not all odd");
        }
    }
    
    public static boolean allDigitsOdd(int number) {
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            
            if (digit % 2 == 0) {   
                return false;
            }
        }
        
        return true;
    }
}
