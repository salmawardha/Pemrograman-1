import java.io.*;  
import java.util.*; 

public class flipLines {
public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner(new File("fliplines.txt"));
   flipLines(input);
}

public static void flipLines(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        if (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        System.out.println(line);
    }
  }
}

