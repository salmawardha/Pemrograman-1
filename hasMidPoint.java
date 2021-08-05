public class hasMidPoint {
public static void main(String[] args) {
   hasMidPoint hmp  = new hasMidPoint();
   System.out.println(hmp.hasMidPoint(3,7,5));
   }

public static boolean hasMidPoint( int a, int b, int c ) {
   int midPredict;
   if ( a > b )
   {
      midPredict = (a - b)/2;
   if ( c == a - midPredict && c == b + midPredict )
   return true;
   }
   else {
      midPredict = (b - a)/2;
   if ( c == b - midPredict && c == a + midPredict )
   return true;
   }
   return false;
   }
}

