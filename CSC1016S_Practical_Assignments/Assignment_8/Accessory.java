//class Accessory: Subclass of Computer
//RTSREC001
//Rector Ratsaka
//07 October 2022

public class Accessory extends Computer{
 public Accessory(String serialNum,String manufacturer,String colour){
  super(serialNum,manufacturer,colour);
 }
 //copy contructor
 public Accessory(Accessory a){
 super(a);
 }
 //check if two Accessories are equal 
 public boolean equals(Accessory other){
 if(super.equals(other)){
 return true;
 }
 return false;
 }
 //String representation of Accessory and overriding Computer toString method
 @Override
 public String toString(){
 return "Accessories: "+super.toString();
 }
}