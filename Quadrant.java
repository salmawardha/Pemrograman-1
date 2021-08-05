import java.io.*;
public class Quadrant {
public static void main(String[] args){

   int qd=quadrant(-2.3,14.2);
   System.out.println("The call of quadrant(-2.3,14.2)returns "+qd);
   }

public static int quadrant(double x, double y)
{
   if(x==0 || y==0)
      return 0;
   else if(x>0&&y>0)
      return 1;
   else if(x<0&&y>0)
      return 2;
   else if(x<0&&y<0)
      return 3;
   else
      return 4;
   }
}

