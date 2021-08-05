import java.util.*;
public class equals{
  public static void main(String[] args){
    
}
  public static boolean comparearr(int a[] ,int b[]){
     if(a.length!=b.length){
        return false;
     }
     else{
        for(int i=0;i<a.length;i++){
     if(a[i]!=b[i])
        return false;
         }
       }
        return true;
   }  
 }
 