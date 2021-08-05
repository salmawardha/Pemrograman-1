import java.util.*;
public class maxErrors  {
  public static void main(String[] args){
    
}
public static int max(int[] data) {
    int max = data[0];
    for (int i = 1; i < data.length; i++) {
        if (data[i] > max) {
            max = data[i];
        }
    }
    return max;
    }
}
