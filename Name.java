public class NamaSalma {
   public static void main(String args[]) {
      ltS();
      p();
      ltA();
      p();
      ltL();
      p();
      ltM();
      p();
      ltA();
   }

private static void ltS() {
      p("   SSSSS   ");
      p("  S     S  ");
      p("  S        ");
      p("   SSSSS   ");
      p("        S  ");
      p("  S     S  ");
      p("   SSSSS   ");
   }
   
   private static void ltA() {
      p("    AAA    ");
      p("   A   A   ");
      p("  A     A  ");
      p("  AAAAAAA  ");
      p("  A     A  ");
      p("  A     A  ");
      p("  A     A  ");      
   }
   
   private static void ltL() {
      p("   L         ");
      p("   L         ");
      p("   L         ");
      p("   L         ");
      p("   L         ");
      p("   LLLLLLL   "); 
   }
   
   private static void ltM() {
      p("   M     M   ");
      p("   MM   MM   ");
      p("   M M M M   ");
      p("   M  M  M   ");
      p("   M     M   ");
      p("   M     M   "); 
   }
   
   private static void ltA() {
      p("    AAA    ");
      p("   A   A   ");
      p("  A     A  ");
      p("  AAAAAAA  ");
      p("  A     A  ");
      p("  A     A  ");
      p("  A     A  ");      
   }


   
   private static void p() {
      p("");
   }
   
   private static void p(String t) {
      System.out.println(t);
   }
}