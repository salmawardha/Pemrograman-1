import java.util.Arrays;
import java.util.stream.Collectors;

public class pigLa {
   public static void main(String[] args){
      System.out.println("go settle mariners -> "+ pigLatin("go settle mariners"));
      System.out.println("here we go again -> "+ pigLatin("here we go again"));
      System.out.println("no more fun -> "+ pigLatin("no more fun"));
      System.out.println("we are the fallen -> "+ pigLatin("we are the fallen"));
      System.out.println("you never need -> "+ pigLatin("you never need"));
      }
private static String pigLatin(String sentence){
   return Arrays.stream(sentence.split(" ")).map(s -> s.substring(1) + "-" + s.charAt(0) + "ay").collect(Collectors.joining(" "));
      }
}


      