// A programme of a duration range.
//Rector Ratsaka
//RTSREC001
//22 August 2022

public class TimePeriod {
 private Duration lowerBound;
 private Duration upperBound;
 
public TimePeriod(Duration lowerBound, Duration upperBound) {
  //create a timeperiod with the given inclusive lowerbound and exclusive upperbound.
  this.lowerBound = lowerBound;
  this.upperBound = upperBound;
 }
 public Duration lowerBound() {
  //obtain lowerbound for this timeperiod.
  return lowerBound;
 
 }
 public Duration upperBound() {
   //obtain upperbound for this timeperiod.
   return upperBound;
 
 }
 public boolean includes(Duration duration) {
   //determine whether the given duration falls within this timeperiod.
   if (((lowerBound().compareTo(duration))<=0) && (upperBound().compareTo(duration))>0)
   return true;
  else 
   return false;
  

  
 }
 public boolean precedes(TimePeriod other){
   //determine whether this timeperiod precedes other timeperiod 
   if (this.upperBound().compareTo(other.lowerBound())<=0)
   return true;
  else 
   return false;

 
 }
 public boolean adjacent(TimePeriod other) {
   //determine whether this time period is adjacent tothe other timeperiod.
   if (this.upperBound().compareTo(other.lowerBound())==0 || (this.lowerBound().compareTo(other.upperBound()))==0)
   return true;
  else 
   return false;

 }
 public String toString() {
   //obtain a string representation of this time period.
   return "["+Duration.format(this.lowerBound,"minute")+" .. "+Duration.format(this.upperBound,"minute")+"]";
 }
 
 }
