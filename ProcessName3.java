import java.util.*;

public class ProcessName3 {
public static void main (String args []) {
   Scanner s = new Scanner(System.in);
   String nama = null;
   
   while(true) {
      System.out.print("Type your name : ");
      nama = s.nextLine();
      
   if(!nama.contains(" ") || nama.length() < 5) {
      System.out.println("Error, must be at least 5 chars with a space.");
      }
   else {
   break;
   }
  };
  
  System.out.println("Your name is : " + nama);
  }
 }
 