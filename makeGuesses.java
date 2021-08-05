import java.util.Random;
import java.util.*;

public class makeGuesses {
public static void main (String args []) {

    int count = 0;
    Random r = new Random();
    int guess;
    
    do {
        guess = 1 + r.nextInt(50);
        count++;
        System.out.println("guess = " + guess);
    } while(guess < 48);
    
    System.out.println("total guesses = " + count);
   } 
}

