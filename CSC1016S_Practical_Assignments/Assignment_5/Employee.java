//A programme of Employee from the perspective of time keeping. Itrecords the employee name and ID, and logs sign-ins and sign-outs.
//RTSREC001
//Rector Ratsaka
//30 August 2022

import java.util.*;
public class Employee {
 private String name;
 private String uid;
 private ArrayList<Shift> shifts;
 private ArrayList<CalendarTime> calendarTimes;
 private int numShifts;
 private int numTimes; 
 public Employee(String name, String uid){
 // Create an Employee representing the employee with given name and UID.
 this.name=name;
 this.uid=uid;
 shifts = new ArrayList<Shift>();
 calendarTimes = new ArrayList<CalendarTime>();
 numShifts = 0;
 numTimes = 0;
 }
 public String name(){
 // Obtain this employee's name.
 return this.name;
 }
 public String UID(){
 // Obtain this Employee's ID.
 return uid;
 }
 public void signIn(Date d, Time t){
 // Record that this employee has begun a shift on the given date and at the given time.
 calendarTimes.add(new CalendarTime(d,t));
  numTimes++;
 }
 public void signOut(Date d, Time t){
 // Record that this employee has completed a shift on the given date and at the given time.
 if ((new CalendarTime(d,t).compareTo((calendarTimes.get(numTimes-1)))>=0)){
    calendarTimes.add(new CalendarTime(d,t));
    shifts.add(new Shift(calendarTimes.get(numTimes-1),new CalendarTime(d,t)));
    numTimes++;
    numShifts++;
    }
    else {
     calendarTimes.remove(numTimes-1);
     numTimes--;
    }
 }
 public boolean present(){
 // Determine whether this employee is present i.e. has signed-in and not yet signed-out.
if (numTimes==0){
 return false;
}
else if ((numTimes-1)%2==0){
  return true;
}
return false;
 }
 public boolean worked(Date d){
 // Determine whether this employee worked a shift that at least partly occurred on the given date.
 for (int i=0;i<numShifts;i++){
  if (shifts.get(i).includesDate(d)){
  return true;
  }
 }
  return false;
 }
 public boolean worked(Week w){
 // Determine whether this employee worked at least one shift during the given week.
 for (int i=0;i<numShifts;i++){
  if (shifts.get(i).inWeek(w)){
  return true;
  }
 }
  return false;
 }
 public List<Shift> get(Date d){
 // Obtain the shift(s) worked by this employee that at least partly occur on the given date.
 ArrayList<Shift> list = new ArrayList<Shift>();
 for (int i=0;i<numShifts;i++){
   if (shifts.get(i).includesDate(d)){
       list.add(shifts.get(i));
   }
  }
  return list;

 }
 public List<Shift> get(Week w){
 // Obtain a list of the shifts worked by this employee during the given week.
 ArrayList<Shift> list = new ArrayList<Shift>();
 for (int i=0;i<numShifts;i++){
   if (shifts.get(i).inWeek(w)){
       list.add(shifts.get(i));
   }
  }
  return list;
 }
 public Duration hours(Week w){
 // Returns the total time (hours and minutes) worked during the given week
 Duration d  = new Duration("hour",0);
 for (int i=0;i<get(w).size();i++){
    d= new Duration(d.add(get(w).get(i).length()));
                        
  }
  return d;

 }
}