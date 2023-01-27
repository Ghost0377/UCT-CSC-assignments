//class Screen: Subclass of Computer
//RTSREC001
//Rector Ratsaka
//07 October 2022

public class Screen extends Computer{
private int size;
 public Screen(String serialNum,String manufacturer,String colour,int size){
  super(serialNum,manufacturer,colour);
  this.size=size;
 }
 //copy contructor 
 public Screen(Screen s){
 super(s);
 this.size=s.size;
 }
 //getter and setter methods
 public int getSize(){
 return this.size;
 }
 public void setSize(int size){
 this.size=size;
 }
 //check if two boxes are equal 
 public boolean equals(Screen other){
 if(super.equals(other) && this.size==other.size){
 return true;
 }
 return false;
 }
 //String representation of screens and overriding Computer toString method
 @Override
 public String toString(){
 return "Screen: "+super.toString()+", "+this.size;
 }
}