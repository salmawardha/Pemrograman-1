public class MysterySoda {
    public static void main(String[] args) {
        String soda = "coke";
        String pop = "pepsi";
        String pepsi = "soda";
        
        // #1 = "coke", #2 = "pepsi", #3 = "soda"
        carbonated(soda, pop, pepsi);
    }
    //                                    #1           #2           #3
    public static void carbonated(String coke, String soda, String pop) {
        //                           #2               #3             #1
        System.out.println("say " + soda + " not " + pop + " or " + coke);
    }
}