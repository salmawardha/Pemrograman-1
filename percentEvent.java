import java.util.*;

public class percentEvent {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.println("Let's find the range.");
    System.out.println("Enter five numbers to find the range.");

    int num = console.nextInt();
    int[] list = new int[num];

    System.out.println("The numbers you entered are: " + list.length); 
    System.out.println();

    percentEven(list);

    }

    public static void percentEven(int[] num){
        int percent = 0;
        int even = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
            even++;
            }

        }  

      percent = (even / num.length) *100;

        System.out.println("The percent of even numbers is: " + percent);      
    }


}
