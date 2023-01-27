//A programme to demonstrate the use of inheritance by creating and outputting 3 simple objects, where the classes for the second and third objects inherit from the class for the first object. 
//Rectangle: Child class
//RTSREC001
//Rector Ratsaka
//19 September 2022

public class Rectangle extends Shape {
//instant variables
 private double length;
 private double width;
 
 public Rectangle(String name,String colour,double length,double width) {
 //creating object of Rectangle and using variables from Superclass:Shape
 super(name,colour);
 this.length=length;
 this.width=width;
 }
 public Rectangle(Rectangle r){
 //Copy contructor of Rectangle
 super(r);
 this.length=r.length;
 this.width=r.width;
 }
 public String toString(){
 //String representation of Rectangle and overriding toString metthod of Shape
 return super.toString()+" Length "+this.length+" Width "+this.width;
 }
}
