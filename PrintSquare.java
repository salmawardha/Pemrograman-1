public class PrintSquare {
    public static void main (String[] args) {
    PrintSquare(3,6);
}
public static void PrintSquare(int min, int max) {
    for (int i = min; i <= max; i++) { 
    
        for (int j = i; j <= max; j++) {
            System.out.print(j);
        }
        
        for (int j = min; j < i; j++) {
            System.out.print(j);
        }
        
        System.out.println();
    }
}
}

