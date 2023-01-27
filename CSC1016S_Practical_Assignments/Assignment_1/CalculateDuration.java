// A program that accepts as input two 24-hour clock times, that calculates the period between them, and then prints the result as a quantity of minutes.
// Rector Ratsaka
// RTSREC001
// 28 July 2022

import java.util.*;
public class CalculateDuration
{
 public static void main(String[] args)
 {
 
 Scanner input = new Scanner(System.in);
 
 System.out.println("Enter time A:");
 Time time_A = new Time(input.nextLine());
 
 System.out.println("Enter time B:");
 Time time_B = new Time(input.nextLine());
 
 Duration duration = new Duration(time_B.subtract(time_A));
 
 System.out.print("The time "+time_B+" occurs "+duration.intValue("minute")+" minutes after the time "+time_A+".");
 }
}