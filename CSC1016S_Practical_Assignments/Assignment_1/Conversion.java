// CSC1016S assignment 01
// Exercise 1
// Rector Ratsaka
// RTSREC001
// 28 July 2022

// A java program for metric conversion.



public class Conversion{
   // Function definitions
   public Conversion()
   {
   
   }
 
   public double feet2Metres(double feet)
   {
      double metres;
      
      // this function takes feet as a parameter and calculates the corresponding number of metres.
      metres = feet/3.2808;   
      return metres;
   }
   
   public double inches2Cm(double inch)
   {
      double centimetre;
      
      // this function takes feet as a parameter and calculates the corresponding number of metres.
      centimetre = inch/0.39370; 
      return centimetre;
   }
   
   public double feet2Inches(double feet)
   {
      double inches;
      
      // this function takes feet as a parameter and calculates the corresponding number of inches.
      inches = feet*12.000;     
      return inches;
   }
   
   public double kilometres2Miles(double kilometres)
   {
      double miles;
      
      // this function takes kilometre as a parameter and calculates the corresponding number of miles.
      miles = kilometres*0.6214;
      return miles;
   }
   
 }