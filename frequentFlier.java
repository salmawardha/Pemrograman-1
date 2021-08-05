import java.io.*;  
import java.util.ArrayList;
import java.util.StringTokenizer;
public class frequentFlier {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("frequent.txt")));
        String str = null;
        String token = null;
        int totalMiles = 0;
        int lines = 0;
        ArrayList<String> flierClasses = new ArrayList<String>();
        ArrayList<Integer> mileages = new ArrayList<Integer>();

        try {
            while((str = input.readLine()) != null) {
                lines++; 
                StringTokenizer tokenizer = new StringTokenizer(str);
                while(tokenizer.hasMoreTokens()) {
                    token = tokenizer.nextToken();

                    if(!(IsInteger.IsaInteger(token))) {
                        flierClasses.add(token); 
                    } else {
                        mileages.add(Integer.parseInt(token)); 
                    }
                }
            }
        } catch(NumberFormatException ex) {
            ex.printStackTrace();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        for(int i = 0; i < flierClasses.size(); i++) {
            totalMiles += calculateFlierMiles(flierClasses.get(i), mileages.get(i));
        }

        System.out.println("Frequent-flier miles the person earns: " + totalMiles);
    }

    private static int calculateFlierMiles(final String flierClass, final int mileage) {
        if(flierClass.equals("firstclass")) return(2 * mileage);
        else if(flierClass.equals("coach")) return(1 * mileage);
        else if(flierClass.equals("discount")) return(0 * mileage);
        return 0;
    }
}

