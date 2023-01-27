//A programme to store some details of computer in a single list, with the options of listing all parts or deleting a particular part.
//RTSREC001
//Rector Ratsaka
//07 October 2022

import java.util.Scanner;
import java.util.ArrayList;

public class Question1{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  ArrayList<Computer> devices = new ArrayList<Computer>();
  System.out.println("Welcome to Great International Technology");
  System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
  String choice = input.nextLine().toUpperCase();
  
  while(!(choice.equals("Q"))){
     if (choice.equals("B")){ //use information entered store it in devices list as Box
      System.out.println("Enter the serial number");
      String serialNum = input.nextLine();
      System.out.println("Enter the manufacturer");
      String manufacturer = input.nextLine();
      System.out.println("Enter the colour");
      String colour = input.nextLine();
      System.out.println("Enter the amount of memory (MB)");
      long memory = input.nextLong();
      Computer boxes= new Box(new Box( serialNum, manufacturer, colour, memory));
      devices.add(boxes);
      System.out.println("Done");
      System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
     }
     else if (choice.equals("A")){ //use information entered store it in devices list as Accessories
      System.out.println("Enter the serial number");
      String serialNum = input.nextLine();
      System.out.println("Enter the manufacturer");
      String manufacturer = input.nextLine();
      System.out.println("Enter the colour");
      String colour = input.nextLine();
      Computer accessories= new Accessory( serialNum, manufacturer, colour);
      devices.add(accessories);
      System.out.println("Done");
     System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
     }
     else if (choice.equals("S")){ //use information entered store it in devices list as Screen
      System.out.println("Enter the serial number");
      String serialNum = input.nextLine();
      System.out.println("Enter the manufacturer");
      String manufacturer = input.nextLine();
      System.out.println("Enter the colour");
      String colour = input.nextLine();
      System.out.println("Enter the screen size in inches");
      int size = input.nextInt();
      Computer screen= new Screen( serialNum,colour, manufacturer, size);
      devices.add(screen);
      System.out.println("Done");
      System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
    }
    else if (choice.equals("L")){ //print list of all devices 
    if (devices.size() > 0){
     for (int i=0; i<devices.size(); i++){
       System.out.println(devices.get(i));
     }
    }
    System.out.println("Done");
    System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
    }
    else if (choice.equals("D")){ //Delete a device from list
    System.out.println("Enter the serial number");
    String serialNum = input.nextLine();
    int k = devices.size(); 
    int i=0;              
    if (devices.size() > 0){
      for (i=0; i<devices.size(); i++){
        if (devices.get(i).getSerialNum().equals(serialNum)){
          devices.remove(devices.get(i));
          break;
        }
      }
    }
    if (i==0 ||devices.size() < k){
      System.out.println("Done");
      System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
    }
    else{
    System.out.println("Not found");
    System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
    }
  }
  choice = input.nextLine().toUpperCase();
 }
}
}