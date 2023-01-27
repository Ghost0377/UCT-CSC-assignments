//A program that asks the user to enter a series of Rand amounts, sums them, and prints the result.
//Rector Ratsaka
//RTSREC001
//02 August 2022

import java.util.*;

public class SumCosts {
 public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
  
  Currency rand = new Currency("R", "ZAR", 100);
  Money money = new Money("R0.00", rand);
  
  System.out.println("Enter an amount or '[D]one' to quit:");
  String amount = input.nextLine();
  
  while (amount.charAt(0)!='D') {
    Money new_amount = new Money(amount, rand);
    money = money.add(new_amount);
    System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
    amount = input.nextLine();
  }
  
  System.out.println("Total: "+money.toString());

 }
}