import java.io.*;  
import java.util.*; 

public class printDuplicates {
public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner(new File("print.txt"));
   printDuplicates(input);
}

public static void printDuplicates(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner console = new Scanner(line);
        String last = console.next();
        int count = 1;
        
        while (console.hasNext()) {
            String current = console.next();
            if (last.equals(current)) {
                count++;
            } else {
                if (count > 1) {
                    System.out.print(last + "*" + count + " ");
                }
                count = 1;
            }
            last = current;
        }
        
        if (count > 1) {
            System.out.print(last + "*" + count + " ");
        }
        System.out.println();
    }
  }
}
