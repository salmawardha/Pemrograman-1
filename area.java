public  class area {
public static void main(String[] args) {

   double result = area(2);
   System.out.print("Luas : " + result);
   
   }
   
   public static double area(double r) {
   double result = Math.PI * r * r;
   return result;
}
}

