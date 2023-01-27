//A programme of work shift.
//RTSREC001
//Rector Ratsaka
//30 August 2022

public class Shift {
 private CalendarTime start,finish;
   public Shift(CalendarTime start, CalendarTime finish) {
   // Create a Shift object representing a shift worked between the given date times.
   this.start=start;
   this.finish=finish;
   }
   public CalendarTime start() {
   // Obtain the start date and time for this shift.
   return this.start;
   }
   public CalendarTime finish() {
   // Obtain the end date and time for this shift.
   return this.finish;
   }
   public boolean inWeek(Week w){
   // Determine whether this shift occurred within the given week.
   return ((w.includes(start.date()))||(w.includes(finish.date())));
   
   }
   public boolean includesDate(Date date) {
   // Determine whether this shift at least partly occurred on the given date.
   return ((date.compareTo(start.date()))==0 || (date.compareTo(finish.date()))==0);

   }
   public Duration length() {
   // Obtain the length of this shift.
   return finish.subtract(start);
   }
   public String toString() {
   // Obtain a string representation of this shift of the form "<date>%:<time>-<date>%:<time>".
   return start+" - "+finish;
   }
   
}