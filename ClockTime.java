public class ClockTime {
   private int hour;
   private int min;
   private String amPm;
   @Override
   public String toString() {
       return "Clocktime [hour=" + hour + ", min=" + min + ", amPm=" + amPm + "]";
   }
   public ClockTime(int hour, int min, String amPm) {
       super();
       this.hour = hour;
       this.min = min;
       this.amPm = amPm;
   }
   public int getHour() {
       return hour;
   }
   public void setHour(int hour) {
       this.hour = hour;
   }
   public int getMin() {
       return min;
   }
   public void setMin(int min) {
       this.min = min;
   }
   public String getAmPm() {
       return amPm;
   }
   public void setAmPm(String amPm) {
       this.amPm = amPm;
   }
public void isWorkTime(){
   if (hour>=9&& hour<=11 && min>=0&& min<=59 && amPm.contentEquals("AM")){
       System.out.println("True");
   }
   else if (hour==12 && min>=0&& min<=59 && amPm.contentEquals("PM")){
       System.out.println("True");
   }
   else    if (hour>=1&& hour<=4 && min>=0&& min<=59 && amPm.contentEquals("PM")){
       System.out.println("True");
   }
   else if (hour==5&& min==0&&amPm.equals("PM")){
       System.out.println("True");
   }
   else
       System.out.println("False");
}

   public static void main(String[] args) {
       ClockTime t1= new ClockTime(12,45,"AM");
       ClockTime t2= new ClockTime(6,2,"AM");
       ClockTime t3= new ClockTime(8,59,"AM");
       ClockTime t4= new ClockTime(9,0,"AM");
       ClockTime t5= new ClockTime(11,38,"AM");
       ClockTime t6= new ClockTime(12,53,"PM");
       ClockTime t7= new ClockTime(3,15,"PM");
       ClockTime t8= new ClockTime(4,59,"PM");
       ClockTime t9= new ClockTime(5,0,"PM");
       ClockTime t10= new ClockTime(5,1,"AM");
       ClockTime t11= new ClockTime(8,30,"PM");
       ClockTime t12= new ClockTime(11,59,"PM");
       System.out.println(t1.toString());
       t1.isWorkTime();
       System.out.println(t2.toString());
       t2.isWorkTime();
       System.out.println(t3.toString());
       t3.isWorkTime();
       System.out.println(t4.toString());
       t4.isWorkTime();
       System.out.println(t5.toString());
       t5.isWorkTime();
       System.out.println(t6.toString());
       t6.isWorkTime();
       System.out.println(t7.toString());
       t7.isWorkTime();
       System.out.println(t8.toString());
       t8.isWorkTime();
       System.out.println(t9.toString());
       t9.isWorkTime();
       System.out.println(t10.toString());
       t10.isWorkTime();
       System.out.println(t11.toString());
       t11.isWorkTime();
       System.out.println(t12.toString());
       t12.isWorkTime();
   }
} 