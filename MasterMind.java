import java.util.*;
import java.io.*;
import java.text.*;

public class MasterMind {
public static void main (String args[]) {
   int tryy = 0;
   List<Integer> secretnumber = randomnumber();
   List<Integer> guess;
   Scanner s = new Scanner(System.in);
   
   writefile("\nLet's Start!");
   
   while(tryy++ < 10){
      System.out.println("Try-" + tryy + "\n");
      writefile("Try-" + tryy);
      
      guess = new ArrayList<>();
      
      for(int i = 0; i < 4; i++) {
      System.out.println("Enter a guess : ");
      guess.add(s.nextInt());
      }
      
      String tb = "Guess a player : ";
      for(int gs : guess)
         tb += String.format("%d", gs);
         
      writefile(tb);
      System.out.println();
      
      if(findgreen(guess, secretnumber) ==4) {
         System.out.println("Congratz, your guess is right!");
         writefile("Your gues is right!");
         writefile("Game Over.");
         return;
       } else if (tryy < 10) {
         System.out.println("Guess wrong.\n");
         System.out.println("Hint");
         System.out.println("Red : " + findred(guess, secretnumber));
         System.out.println("Yellow : " + findyellow(guess, secretnumber));
         System.out.println("Green : " + findgreen(guess, secretnumber));
         writefile("Guess Wrong | Hint - Red : " + findred(guess, secretnumber) +
                      "Yellow : " + findyellow(guess, secretnumber) + "Green : " +
                      findgreen(guess, secretnumber));
       }
       
       System.out.println();
     }
     
     System.out.println("Maximum attempts have been reached, you have failed\n");
     String snLog = "The secret number is : ";
     
     for(int sn : secretnumber)
        snLog +=String.format("%d ", sn);
        
     System.out.println(snLog);
     writefile(snLog);
     writefile("Game Over.");
     
     }
     
     public static List<Integer> randomnumber () {
      List<Integer> result = new ArrayList<>();
      Random rand = new Random();
      
      for (int i = 0; i < 4; i++)
         result.add(rand.nextInt(10));
         
         return result;
      }
      
      public static int findgreen(List<Integer> a, List<Integer> b) {
         int result = 0;
         
         for(int i = 0; i < a.size() && i < b.size() ; i++){
          if(a.get(i) == b.get(i))
             result++ ;
             
       }
       
       return result;
       
       }
       
       public static int findred(List<Integer> a, List<Integer> b) {
         int result = 0;
         List<Integer> c = new ArrayList<>();
         
         for(int nb : b) {
             c.add(nb);
         }
         
         for(int na : a) {
             if(!c.contains(na))
                result++;
             else
                 c.remove(c.indexOf(na));
          }
          
          return result;
          
          }
          
          public static int findyellow(List<Integer> a, List<Integer> b) {
            return 4 - findred(a , b) - findgreen(a , b);
            
          }
          
          public static void writefile(String text) {
            try{
               FileWriter fw = new FileWriter("SalmaK.txt", true);
               BufferedWriter bw = new BufferedWriter(fw);
               PrintWriter pw = new PrintWriter (bw);
               pw.println(text);
               pw.close();
               } catch (IOException e) {
                 System.out.println("There is an error");
               }
             }
           }
         