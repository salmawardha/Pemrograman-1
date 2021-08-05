import java.io.*;  
import java.util.*; 
public class mostCommonNames {
public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner(new File("mostcommon.txt"));
   mostCommonNames(input);
}
public static int mostCommonNames(Scanner input) {
    int uniqueName = 0;
    while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner console = new Scanner(line);
        String last = console.next();
        uniqueName++;
        String commonWord = last;
        int mostCommon = 1;
        int count = 1;
        
        while (console.hasNext()) {
            String current = console.next();
            if (current.equals(last)) {
                count++;
            } else {
                if (count > mostCommon) {
                    mostCommon = count;
                    commonWord = last;     
                }
                count = 1;
                uniqueName++;
            }
            last = current;
        }
        if (count > mostCommon) {
            commonWord = last;
        }
        System.out.println("Most common: " + commonWord);
    }
    return uniqueName;
   }
 }