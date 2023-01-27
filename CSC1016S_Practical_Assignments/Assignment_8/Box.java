// class box: Subclass of Computer 
//RTSREC001
//Rector Ratsaka
//07 October 2022

public class Box extends Computer{
 private long memory;
 public Box(String serialNum,String manufacturer,String colour,long memory){
  super(serialNum,manufacturer,colour);
  this.memory=memory;
 }
 //Copy constructor
 public Box(Box b){
 super(b);
 this.memory=b.memory;
 }
 //getter and setter methods
 public long getMemory(){ 
 return this.memory;
 }
 public void setMemory(long memory){
 this.memory=memory;
 }
 //check if two boxes are equal 
 public boolean equals(Box other){
 if(super.equals(other) && this.memory==other.memory){
 return true;
 }
 return false;
 }
 //String representation of box and overriding Computer toString method
 @Override
 public String toString(){
 return "Box: "+super.toString()+", "+this.memory;
 }
}
