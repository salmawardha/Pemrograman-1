import java.io.*;  
import java.util.*; 

public class countWords2 {
public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner(new File("wordinput.txt"));
   countWords(input);
}
public static void countWords(Scanner input) {
   int lineCount = 0;
   int wordCount = 0;
    
    while (input.hasNextLine()) {
        String line = input.nextLine();   // read one line
        lineCount++;
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()) {      // count tokens in line
            String word = lineScan.next();
            wordCount++;
        }
    }
    
    System.out.println("Total lines = " + lineCount);
    System.out.println("Total words = " + wordCount);
    System.out.printf("Average words per line = %.3f\n", (double) wordCount / lineCount);
    }
}

