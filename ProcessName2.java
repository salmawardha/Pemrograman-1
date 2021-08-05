import java.util.*;  

public class ProcessName2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String[] inp = console.nextLine().toString().split(" ");
        String name = inp[1]+", "+Character.toUpperCase(inp[0].charAt(0))+".";        
        System.out.println("Your name is: " + name);
    }
}

