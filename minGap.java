import java.util.*;
public class minGap{
  public static void main(String[] args){
    int[] list = {1, 3, 6, 7, 12};
    
}
  public int minGap(int[] a) {
    if(a.length < 2)
        return 0;
        
    int min = a[1] - a[0];
    
    for(int i = 1; i <= a.length - 2; i++) {
        if(a[i+1] - a[i] < min)
            min = a[i+1] - a[i];
    }
    
    return min;
    }
}
