//A programme to demonstrate the use of inheritance by creating and outputting 3 simple objects, where the classes for the second and third objects inherit from the class for the first object. 
//Shape: Superclass
//RTSREC001
//Rector Ratsaka
//19 September 2022

public class Shape {
//instant variables
 private String name;
 private String colour;
 
 public Shape(String name, String colour){
 //creating object of Shape
 this.name = name;
 this.colour = colour;
 }
 public Shape(Shape s){
 //Copy contructor of Shape
 this.name=s.name;
 this.colour=s.colour;
 }
 public String toString(){
 //String representation of Shape
 return this.name+" "+this.colour;
 }
}