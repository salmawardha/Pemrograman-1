import java.io.*;  
import java.util.*; 

public class coinFlip {
public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner(new File("coin.txt"));
   coinFlip(input);
}

public static void coinFlip(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner console = new Scanner(line);
        int head = 0;
        int total = 0;
        
        while (console.hasNext()) {
            total++;
            if (console.next().toLowerCase().equals("h")) {
                head++;
            }
        }
        
        System.out.printf("%d heads (%.1f%%)\n", head, head * 100.0 / total);
        if (head * 100.0 / total > 50) {
            System.out.println("You win!");
        }
        System.out.println();
    }
  }
}

