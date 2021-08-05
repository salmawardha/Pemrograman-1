import java.io.*;  
import java.util.*; 

public class stripHtmlTags {
public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner(new File("striphtmltags.txt"));
   stripHtmlTags(input);
}

public static void stripHtmlTags(Scanner input) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        
        while (line.contains("<") || line.contains(">")) {
            int index1 = line.indexOf("<");
            int index2 = line.indexOf(">");
            if (index1 == 0) {
                line = line.substring(index2 + 1);
            } else {
                line = line.substring(0, index1) + line.substring(index2 + 1);
            }
        }
        
        System.out.println(line);
    }
  }
}

