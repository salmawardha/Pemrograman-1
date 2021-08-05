/* public class ClockTime implements Comparable<ClockTime> {
        private int hours;
        private int minutes;
        private String amPm;
    
        public ClockTime(int hours, int minutes, String amPm) {
            this.hours = hours;
            this.minutes = minutes;
            this.amPm = amPm;
        }
    
        public int compareTo(ClockTime other) {
            if (!amPm.equals(other.amPm)) {
                return amPm.compareTo(other.amPm);
            } else if (hours != other.hours) {
                return hours % 12 - other.hours % 12;
            } else {
                return minutes - other.minutes;
            }
        }
    
        public int getHours() {
            return hours;
        }
    
        public int getMinutes() {
            return minutes;
        }
    
        public String getAmPm() {
            return amPm;
        }
    
        public String toString() {
            String result = hours + ":";
            if (minutes < 10) {
                result += "0" + minutes;
            } else {
                result += minutes;
            }
            result += " " + amPm;
            return result;
        }
    } */
    
public class ClockTime
{
   int hours,minutes;
   String AP;
   //3-argument constructor
   ClockTime(int hours,int minutes,String AP)
   {
       this.hours=hours;
       this.minutes=minutes;
       this.AP=AP;
   }
   public void advance(int minutes)
   {
       int tempHours=(minutes/60)%12;//get hours from minutes per 12 hours
       minutes=minutes%60;//get remaining minutes
       //calculate hours and minutes
       if(minutes+this.minutes>60)
       {
           this.minutes=minutes+this.minutes-60;
           this.hours+=1;
       }
       else
           this.minutes=minutes+this.minutes;
       //finally calculate AM or PM as well
       if(tempHours+this.hours>12)
       {
           this.hours=tempHours+this.hours-12;
           if(AP.equals("AM"))
               this.AP="PM";
           else
               this.AP="AM";
       }
       else
           this.hours=tempHours+this.hours;
       System.out.println(this.hours+":"+this.minutes+" "+this.AP);
   }//end of method advance
   public static void main(String[] args)
   {
       ClockTime time = new ClockTime(6, 27, "PM");
       time.advance(1);
       time.advance(30);
       time.advance(5);
       time.advance(60);
       time.advance(128);
       time.advance(180);
       time.advance(1440);
       time.advance(21075);
   }//end of main method

}//end of class
    