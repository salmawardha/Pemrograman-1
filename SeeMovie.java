public class SeeMovie {
public static void main(String[] args){
double costTicket;
int movieRating;
}
public void seeMovie(double costTicket, int movieRating){
   if(costTicket < 5.00){
   System.out.println("Intrested");
}
   else
   if(costTicket >= 12.0 && movieRating < 5){
   System.out.println("Not Intrested");
}
   else
   if(costTicket >= 12.0 && movieRating == 5){
   System.out.println("sort-of Intrested");
}
   else
   if(costTicket < 12.0 && movieRating == 5){
   
   System.out.println("Intrested");
}

   else
   if(costTicket < 11.99 && costTicket < 5.00 && movieRating >2 && movieRating <4){

   System.out.println("sort-of Intrested");
}

   else
   System.out.println("not Intrested");
      }
   }
