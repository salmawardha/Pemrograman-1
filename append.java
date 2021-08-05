import java.util.*;
public class append {
  public static void main(String[] args){
    
    
}
public static int[] append(int[] list1, int[] list2) {
    int[] newList = new int[list1.length + list2.length];
    int index = 0;
    
    for (int i = 0; i < list1.length; i++) {
        newList[index] = list1[i];
        index++;
    }
    
    for (int i = 0; i < list2.length; i++) {
        newList[index] = list2[i];
        index++;
    }
    
    return newList;
   }
}
