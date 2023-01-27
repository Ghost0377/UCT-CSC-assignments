//A programme called Question2.java which acts as your driver class to test Vehicle,Car,Student and Person classes.
//RTSREC001
//Rector Ratsaka
//20 September 2022

import java.util.Scanner;

public class Question2{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.println("Enter the vehicle manufacturer:");
 String maker = input.nextLine();
 System.out.println("Enter the name of the vehicle owner:");
 String name = input.nextLine();
 System.out.println("Enter the owner's gender:");
 String gender = input.nextLine();
 System.out.println("Enter the owner's programme of study:");
 String programmeOfStudy = input.nextLine();
 System.out.println("Enter the owner's Institution name:");
 String nameOfInstitution = input.nextLine();
 System.out.println("Enter the owner's hobbies:");
 String hobbies = input.nextLine();
 System.out.println("Enter the owner's age:");
 int age = input.nextInt();
 System.out.println("Enter the number of cylinders in the engine:");
 int numCylinders = input.nextInt();
 System.out.println("Enter the car seating capacity:");
 int passengers = input.nextInt();
 System.out.println("Enter the weight of the car:");
 double carWeight = input.nextDouble();
 
 Student owner = new Student(name,age,gender,nameOfInstitution,programmeOfStudy,0,hobbies);
 Car car = new Car(numCylinders,maker,owner,passengers,carWeight);
 
 System.out.println(car);
 }
}