//A programme to demonstrate the use of inheritance by creating and outputting 3 simple objects, where the classes for the second and third objects inherit from the class for the first object. 
//Circle: Child class
//RTSREC001
//Rector Ratsaka
//19 September 2022

 public class Circle extends Shape {
 //instant variables
  private double radius;
  
  public Circle(String name,String colour,double radius) {
  //creating object of Circle and using variables from Superclass:Shape
  super(name,colour);
  this.radius=radius;
  }
  public Circle(Circle c){
  //Copy contructor of Circle
  super(c);
  this.radius=c.radius;
  }
  public String toString(){
  //String representation of Circle and overriding toString metthod of Shape
  return super.toString()+" Radius "+this.radius;
  }
 }