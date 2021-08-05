public class ClockTime2{
   int hours,minutes;
   String AP;
   ClockTime2(int hours,int minutes,String AP) {
       this.hours=hours;
       this.minutes=minutes;
       this.AP=AP;
   }
   public void advance(int minutes) {
   int tempHours=(minutes/60)%12;
   minutes=minutes%60;
       
   if(minutes+this.minutes>60) {
   this.minutes=minutes+this.minutes-60;
      this.hours+=1;
   }
   else
      this.minutes=minutes+this.minutes;
   if(tempHours+this.hours>12) {
      this.hours=tempHours+this.hours-12;
   if(AP.equals("AM"))
      this.AP="PM";
   else
      this.AP="AM";
    }
   else
      this.hours=tempHours+this.hours;
      System.out.println(this.hours+":"+this.minutes+" "+this.AP);
   }
   public static void main(String[] args) {
       ClockTime2 time = new ClockTime2(6, 27, "PM");
       time.advance(1);
       time.advance(30);
       time.advance(5);
       time.advance(60);
       time.advance(128);
       time.advance(180);
       time.advance(1440);
       time.advance(21075);  }    }
