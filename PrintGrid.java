public class PrintGrid {
public static void main (String[] args) {

   int row = 4;
   int column = 6;
   int number = 0;

  for (int i = 1; i <= row; i++){
  for (int j = 1; j <= column; j++) {
       number = i + (j*row) - row;
       
  if(number >= 10) {
     System.out.print(number + "  "); 
  }
  else {
     System.out.print(number + "   ");
  }

  }
     System.out.println("");
  }
 }
}

