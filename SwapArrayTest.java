public class SwapArrayTest {
   public static void swapAll(int arr1[], int arr2[]){
      
       for(int i=0; i<arr1.length; i++){
           int temp = arr1[i]; 
           arr1[i] = arr2[i]; 
           arr2[i] = temp; 
       }
      
   }
  
   public static void main(String[] args) {
       int[] a1 = {11, 42, -5, 27, 0, 89};
       int[] a2 = {10, 20, 30, 40, 50, 60};
      
       
       for(int i=0; i<a1.length; i++)
           System.out.print(a1[i]+" ");
       System.out.println();
      
      
       for(int i=0; i<a2.length; i++)
           System.out.print(a2[i]+" ");
       System.out.println();
      
       swapAll(a1, a2);
       System.out.println("----------------------------");
       
       for(int i=0; i<a1.length; i++)
           System.out.print(a1[i]+" ");
       System.out.println();
              
              
       for(int i=0; i<a2.length; i++)
           System.out.print(a2[i]+" ");
       System.out.println();
   }

}


