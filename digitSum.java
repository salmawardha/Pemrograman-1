public class digitSum {
public static void main(String[] args) {
   digitSum ds  = new digitSum();
   System.out.println(ds.digitSum(-456));
   }
public int digitSum(int n) {
    n = Math.abs(n);
    int sum = 0;
    
    while(n > 0) {
        sum += n % 10;
        n /= 10;
    }
    
    return sum;
    }
  }
  
  
