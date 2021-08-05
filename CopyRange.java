import java.io.*;
import java.util.*;
class CopyRange{
public static void copyRange(int a1[], int a2[], int i1, int i2, int l){
   for(int i = 0; i < l; i++)
   a2[i2+i] = a1[i1+i];
   }
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
   int[] a1 = {10, 20, 30, 40, 50, 60};
   int[] a2 = {91, 92, 93, 94, 95, 96};
      System.out.print("Array1: ");
   for(int i = 0; i < 6; i++)
      System.out.print(a1[i]+" ");
      System.out.println();
      System.out.print("Array2: ");
   for(int i = 0; i < 6; i++)
      System.out.print(a2[i]+" ");
      System.out.println();
      System.out.print("Enter the index of matrix a1 to copy from: ");
   int i1 = sc.nextInt();
      System.out.print("Enter the index of matrix a2 to copy to: ");
   int i2 = sc.nextInt();
      System.out.print("Enter the number of elements to copy: ");
   int l = sc.nextInt();
   copyRange(a1, a2, i1, i2, l);
      System.out.print("Array1: ");
   for(int i = 0; i < 6; i++)
      System.out.print(a1[i]+" ");
      System.out.println();
      System.out.print("Array2: ");
   for(int i = 0; i < 6; i++)
      System.out.print(a2[i]+" ");
      System.out.println();
   }
}
