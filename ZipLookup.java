import java.util.*;
import java.io.*;

public class ZipLookup {
    public static final double RADIUS = 3956.6;

    public static void main(String[] args) throws FileNotFoundException {
        giveIntro();
        Scanner console = new Scanner(System.in);

        System.out.print("What zip code are you interested in? ");
        String target = console.next();
        System.out.print("And what proximity (in miles)? ");
        double miles = console.nextDouble();
        System.out.println();

        Scanner input = new Scanner(new File("zipcode.txt"));
        String targetCoordinates = find(target, input);
        input = new  Scanner(new File("zipcode.txt"));
        showMatches(targetCoordinates, input, miles);
    }

    public static void giveIntro() {
        System.out.println("Welcome to the zip code database.");
        System.out.println("Give me a 5-digit zip code and a");
        System.out.println("proximity and I'll tell you where");
        System.out.println("that zip code is located along");
        System.out.println("with a list of other zip codes");
        System.out.println("within the given proximity.");
        System.out.println();
    }

    public static String find(String target, Scanner input) {
        while (input.hasNextLine()) {
            String zip = input.nextLine();
            String city = input.nextLine();
            String coordinates = input.nextLine();
            if (zip.equals(target)) {
                System.out.println(zip + ": " + city);
                return coordinates;
            }
        }
        return "0 0";
    }
    public static void showMatches(String targetCoordinates,
                                   Scanner input, double miles) {
        Scanner data = new Scanner(targetCoordinates);
        double lat1 = data.nextDouble();
        double long1 = data.nextDouble();
        System.out.println("zip codes within " + miles + " miles:");
        while (input.hasNextLine()) {
            String zip = input.nextLine();
            String city = input.nextLine();
            String coordinates = input.nextLine();
            data = new Scanner(coordinates);
            double lat2 = data.nextDouble();
            double long2 = data.nextDouble();
            double distance = distance(lat1, long1, lat2, long2);
            if (distance <= miles) {
                System.out.printf("    %s %s, %3.2f miles\n",
                                  zip, city, distance);
            }
        }
    }
    public static double distance(double lat1, double long1,
                                  double lat2, double long2) {
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}