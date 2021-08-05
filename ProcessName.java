import java.util.*;
public class ProcessName {
   public static void main(String[] args) {
      String name, Original_Name, Name_Changed;
      int Space;
      Scanner console = new Scanner(System.in);
      System.out.print("Type your name: ");
      Original_Name = console.nextLine();
      Space = Original_Name.indexOf(" ");
      Name_Changed = Original_Name.substring(Space+=1);
      name = Name_Changed + ", " + Original_Name.charAt(0) + ".";
      System.out.println("Your name is: " + name);
   }
}

