//computer class: superclass of screen,box and accessory
//RTSREC001
//Rector Ratsaka
//07 October 2022

public class Computer{
 private String serialNum;
 private String manufacturer;
 private String colour;
 
 public Computer(String serialNum,String manufacturer,String colour){
  this.serialNum=serialNum;
  this.manufacturer=manufacturer;
  this.colour=colour;
 }
 //copy constructor
 public Computer(Computer d){
 this.serialNum=d.serialNum;
  this.manufacturer=d.manufacturer;
  this.colour=d.colour;
 }
 //getter and setter methods 
 public String getSerialNum(){
 return this.serialNum;
 }
 public String getManufacturer(){
 return this.manufacturer;
 }
 public String getColour(){
 return this.colour;
 }
 public void setSerialNum(String serialNum){
 this.serialNum=serialNum;
 }
 public void setManufacturer(String manufacturer){
 this.manufacturer=manufacturer;
 }
 public void setgetColour(String colour){
 this.colour=colour;
 }
 //check if computers are equal
 public boolean equals(Computer other){
  if (other==null){
  return false;
  }
  else if(this.serialNum.equals(other.serialNum) && this.colour.equals(other.colour) && this.manufacturer.equals(other.manufacturer)){
  return true;
  }
  return false;
  }
  //string representation of Computer
  public String toString(){
  return this.serialNum+", "+this.manufacturer+", "+this.colour;
 }
}