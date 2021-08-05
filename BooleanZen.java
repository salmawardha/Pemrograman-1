public class BooleanZen {
public static void main (String args[]) {

public static String stutter(String s) {
      String response = ""; // cummulative sum pattern
      for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         response = response + ch + ch;
      }
      return response;
   }
   
   // isVowel returns whether a String is a vowel (a, e, i, o, or u),
   // case-insensitively.
   public static boolean isVowel(String s) {
      s = s.toLowerCase(); // or use equalsIgnoreCase
      return s.equals("a") || s.equals("e") || s.equals("i")
      || s.equals("o") || s.equals("u");
   }
   
   // isNonVowel returns whether a String is any character except a vowel.
   public static boolean isNonVowel(String s) {
      //s = s.toLowerCase();
      //return !s.equals("a") && !s.equals("e" ... De Morgan's law
      return !isVowel(s);
   }
}