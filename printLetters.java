public class printLetters {
public static void main(String[] args) {
   printLetters("rabbit");
   }
public static void printLetters(String text) {
   if(text.length()>0){
      System.out.print(text.charAt(0));
   for (int i = 1; i < text.length(); i++) {
      System.out.print( "-"+text.charAt(i) );
      }
   }
   System.out.println();
   }
}

