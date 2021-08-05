import java.io.*;
import java.util.*;

public class Words {
   public static void main(String[] args) throws FileNotFoundException {
   int wordCount = 0;
   Scanner imput = new Scanner(new File("wordinput.txt"));
   
   while (input.hasNext()) {
   input.next();
   wordCount++;
   }
   System.out.println("Total = " + wordCount);
   }
 }