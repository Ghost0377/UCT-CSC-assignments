//A programme to develop a Ticket class of object. A Ticket object represents a car park ticket. It has a unique ID and time of issue (24-hour clock).

//Rector Ratsaka
//RTSREC001
//13 August 2022

public class Ticket {
//Creating instant variables
  public String id;
  public Time issueTime;
 //Creating constructor for Ticket class
 public Ticket(Time currentTime, String ID) {
  this.issueTime = currentTime;
  this.id = ID;
 }
 //Creating methods
 public String ID() {
  return id;
 }
 
 public Duration age(Time currentTime) {
  return (currentTime.subtract(this.issueTime));
 }
 
 public String toString() {
 return  "Ticket[id="+id+", time="+issueTime+"]";
 }
}