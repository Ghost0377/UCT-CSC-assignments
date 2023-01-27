//A programme of Vehicle: superclass
//RTSREC001
//Rector Ratsaka
//20 September 2022

public class Vehicle {
// instant variables
 private int cylinders;
 private String manufacturer;
 private Student owner;
 
 public Vehicle (int cylinders, String manufacturer, Student owner){
 //creating object of Vehicle 
 this.cylinders=cylinders;
 this.manufacturer=manufacturer;
 this.owner=owner;
 }
 public Vehicle(Vehicle v){
 //copy constructor of Vehicle
 this.cylinders=v.cylinders;
 this.manufacturer=v.manufacturer;
 this.owner=v.owner;
 }
 public String toString(){
 //String representation of Vehicle 
 return this.manufacturer+", "+this.cylinders+" cylinders, owned by "+owner.getName()+", a "+owner.getAge()+"-year old "+owner.getGender()+" studying "+owner.getProgramOfStudy()+" at "+owner.getNameOfInstitution()+". "+owner.getName()+" likes "+owner.getHobbies()+".";
 }
}