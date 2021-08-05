import java.util.Scanner;
public class SeeMovie2 {
   public static final int NOT_INTERESTED = 0;
   public static final int SORT_OF_INTERESTED = 1;
   public static final int VERY_INTERESTED = 2;
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      System.out.print("Cost : ");
      double cost = s.nextDouble();
      System.out.print("Rating : ");
      int rating = s.nextInt();
      System.out.println();
      int interest_level = seeMovie(cost, rating);
      
      if (interest_level == VERY_INTERESTED) {
         System.out.println("I'm VERY INTERESTED to watch this movie.");
      } else if (interest_level == SORT_OF_INTERESTED) {
         System.out.println("I'm SORT OF INTERESTED to watch this movie.");
      } else {
         System.out.println("I'm NOT INTERESTED to watch this movie.");
      }
   }
   public static int seeMovie(double cost, int rating) {
      if(cost < 5){
         return VERY_INTERESTED;
      } else if (cost >= 12){
        if(rating == 5) {
        return SORT_OF_INTERESTED;
      } else {
        return NOT_INTERESTED;
      }
   } else if(rating == 5 && cost < 12) {
        return VERY_INTERESTED;
   } else if ((cost >= 5 && cost < 12) && (rating >= 2 && rating <= 4)) {
        return SORT_OF_INTERESTED;
   } else {
        return NOT_INTERESTED;
    }
  }
}
      
      