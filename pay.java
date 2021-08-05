public  class pay {
public static void main(String[] args) {

   double result = pay(15.00,11);
   System.out.print("Gaji :  " + "$" + result);
   
   }
   
   public static double pay(double gaji, int jam) {
   double total = 0;
   if(jam > 8) {
      total = gaji * 8 + ( jam - 8 ) * ( 1.5 * gaji );
   } else {
      total = gaji * jam;
   }
   return total;
}
}

