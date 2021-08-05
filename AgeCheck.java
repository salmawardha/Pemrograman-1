public class AgeCheck {
    public static void main(String[] args) {
        int myAge = 19;  
        message(myAge);
    }

    public static void message(int age) {
        if (age >= 21) {
            System.out.println("I can legally purchase alcohol!");
        } else if (age >= 17) {
            System.out.println("I can purchase a ticket to an R-rated movie.");
        } else if (age >= 16) {
            System.out.println("I can get my driver's license!");
        }
      }        
    }

