//A programme of Car:subclass of Vehicle
//RTSREC001
//Rector Ratsaka
//20 September 2022

public class Car extends Vehicle{
//instant variables
 private int capacity;
 private double weight;
 
 public Car(int numCylinders, String maker, Student owner, int capacity, double weight){
 //creatign object of Car and using variables of superclass:Vehicle
 super(numCylinders,maker,owner);
 this.capacity=capacity;
 this.weight=weight;
 }
 public Car(Car c){
 //copy constructor of Car
 super(c);
 this.capacity=c.capacity;
 this.weight=c.weight;
 }
 @Override
 public String toString(){
 //String representation of car and overriding toString metthod of Vehicle
 return super.toString()+'\n'+"The car is a "+this.capacity+"-seater weighing "+this.weight+" kg";
 }
}