public class sameDashes2 {
public static void main(String args[]) {
   if(sameDashes("criminal-plan", "(206)555-1384"))
     System.out.println("Same Dashes");
     
   else
     System.out.println("Different Dashes");
     
   }
   
   public static boolean sameDashes(String a, String b) {
      int i1 = -1, i2 = -1;
      
      do {
         i1 = a.indexOf('-', i1 + 1);
         i2 = b.indexOf('-', i2 + 1);
         
            if(i1 != i2)
               return false;
               
          }
          
       while (i1 >= 0 || i2 >= 0);
              return true;
              
          }
    }
    