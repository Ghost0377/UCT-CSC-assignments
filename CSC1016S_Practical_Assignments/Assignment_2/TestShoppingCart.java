//A programme that has the main method to allow the user to capture details of item(s) purchased and print out an invoice for the customer.
//Rector Ratsaka
//RTSREC001
//03 August 2022

import java.util.*;

public class TestShoppingCart {
 public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
  System.out.println("How many items would you like to add to your Shopping Cart?:");
  int items = input.nextInt(); 
    
  if (items==0) {
    System.out.println("Your Shopping Cart is empty.");
  }
  else {
     ShoppingCart shoppingCart = new ShoppingCart();
     for (int i=0; i<items;i++) { 
     System.out.println("Enter the Product Name:");
     String productName = input.next();
     System.out.println("Enter the Quantity:");
     int quantity = input.nextInt();
     System.out.println("Enter the Unit Cost:");
     double unitCost = input.nextDouble();
     Item item = new Item(productName,quantity,unitCost);
     shoppingCart.addItems(item);
     }
     
     System.out.println("The Shopping Cart has the following items:");
     
     shoppingCart.queryCart();
     
     shoppingCart.getDiscount("WELCOME20");
         
     System.out.println("--- Shopping Cart with all items ---");
        
     shoppingCart.printInvoice();
    
    }    
 }
}