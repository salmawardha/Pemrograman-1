import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 4Letter {
   public static void main(String[] args) throws IOExceptions {
      String filename = "File.txt";
      
      System.out.println("File content: ");
      Files.lines(Path.of(filename)).forEach(System.out::println);
      
      System.out.println("\nfourLetterWords: " + fourLetterWords(filename));
      }
      
      private static long fourLetterWords(String name) throws IOExceptions {
      return Files.lines(Path.of(name)).distinct().filter(s -> s.length() == 4).count();
      }
}