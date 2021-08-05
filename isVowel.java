public class isVowel {
public static void main(String args[]) {
   if(isVowel("E"))
      System.out.println("Is a Vowel");
   else
      System.out.println("Not a Vowel");
      
   }
   
   public static boolean isVowel(String c) {
      return c.equalsIgnoreCase("a") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("u") ||
             c.equalsIgnoreCase("e") || c.equalsIgnoreCase("o");
             
    }
 }
 