import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class fourLetter {
   public static void main(String[] args) throws IOException {
      String filename = "File.txt";
      
      System.out.println("File content: ");
      Files.lines(Path.of(filename)).forEach(System.out::println);
      
      System.out.println("\nfourLetterWords: " + fourLetterWords(filename));
      }
      
      private static long fourLetterWords(String name) throws IOException {
      return Files.lines(Path.of(name)).distinct().filter(s -> s.length() == 4).count();
      }
}

