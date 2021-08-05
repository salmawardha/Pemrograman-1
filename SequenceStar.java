public class SequenceStar {
public static void main(String[] args) {
   
    for (int line = 1; line <= 6; line++) {
    for (int stars = 1; stars <= (3 * line + 5); stars++) {
    System.out.printf("*");
    }
    System.out.println();
    }
  }
}

