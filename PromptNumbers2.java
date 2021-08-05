import java.io.*;
import java.util.*; 
public class PromptNumbers2 {
public static void main(String[] args) {
   Scanner console = new Scanner(System.in);
   int count = console.nextInt();
   int[] nums = new int[count];
  
   System.out.println("Your numbers in forward order:");
   printForward(nums);

   System.out.println("Your numbers in backward order:");
   printBackward(nums);
   }


   public static void printForward(int[] a) {
   for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
   }
}

   public static void printBackward(int[] a) {
   for (int i = a.length - 1; i >= 0; i--) {
      System.out.println(a[i]);
   }
  }
 }
 