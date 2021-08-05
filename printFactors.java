public class printFactors {
public static void main(String[] args) {
   printFactors(24);
   }
public static void printFactors(int n) {
   for (int i=1; i <=n; i++) {
   if (n % i == 0) {
   if (i == 1) {
      System.out.print(i);
   }
   else     {
      System.out.print(" and " + i);
            }
         }
      }
   }
}
