public class monthApart {
public static void main (String args[]) {
   monthApart ma  = new monthApart();
   System.out.println(ma.monthApart(1,2,3,4));
   }

public static boolean monthApart(int month1, int day1, int month2, int day2) {
    if (Math.abs(month1 - month2) > 1) {
        return true;
    } else if (Math.abs(month1 - month2) == 1) {
        if (month1 < month2 && day1 <= day2) {
            return true;
        } else if (month1 > month2 && day1 >= day2) {
            return true;
        }
        return false;
    } else { 
        return false;
    }
}
}
