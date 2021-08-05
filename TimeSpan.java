public class TimeSpan {
private int hours;
private int minutes;

public TimeSpan(int initialHours, int initialMinutes) {
   hours = 0;
   minutes = 0;
   add(initialHours, initialMinutes);
   }
public void add(int initialHours, int initialMinutes) {
   hours += initialHours;
   minutes += initialMinutes;
if (minutes >= 60) {
   minutes -= 60; // convert 60 min --> 1 hour
   hours++;
   }
}
public void add(TimeSpan span) {
   add(span.hours, span.minutes);
   }
public double getTotalHours() {
return hours + minutes / 60.0;
   }

public String toString() {
return hours + "h" + minutes + "m";
   }  
}
