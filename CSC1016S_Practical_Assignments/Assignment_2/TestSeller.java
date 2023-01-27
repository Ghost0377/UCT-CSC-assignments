//A programme 
//Rector Ratsaka
//RTSREC001
//03 August 2022

import java.util.Scanner;

public class TestSeller {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 Seller seller = new Seller();
 
 System.out.println("Please enter the details of the seller.");
 
 System.out.print("ID: ");
 seller.id = input.nextLine();
 
 System.out.print("Name: ");
 seller.name = input.nextLine();
 
 System.out.print("Location: ");
 seller.location = input.nextLine();
 
 System.out.print("Product: ");
 seller.product = input.nextLine();
 
 System.out.print("Price: ");
 seller.unitPrice = input.nextLine();
 
 System.out.print("Units: ");
 seller.numUnits = input.nextInt();
 
 System.out.println("The seller has been successfully created:");
 System.out.println("ID of the seller: "+seller.id);
 System.out.println("Name of the seller: "+seller.name);
 System.out.println("Location of the seller: "+seller.location);
 System.out.println("The product to sell: "+seller.product);
 System.out.println("Product unit price: "+seller.unitPrice);
 System.out.println("The number of available units: "+seller.numUnits);
 }
}