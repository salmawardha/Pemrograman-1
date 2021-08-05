public class PointClient {

   public static void main(String[] args) {
       // construct two Point objects, one at (8, 2) and one at (4, 3)
Point p1=new Point(8, 2);
Point p2=new Point(4, 3);

       // display the two Point objects' state
       System.out.println("p1 is "+p1);
       System.out.println("p2 is "+p2);

       // display p1 distance from origin
       System.out.println("p1's distance from origin is "+p1.distanceFromOrigin());
p1.translate(1, 2);
p2.translate(-1,10);
       System.out.println("p1 is now " +p1);
       System.out.println("p2 is now " +p2);

   }

}