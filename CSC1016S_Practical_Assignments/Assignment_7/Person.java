//A programme of Person: Parent class
//RTSREC001
//Rector Ratsaka
//19 September 2022

public class Person{
//instant variables 
 private String name;
 private int age;
 private String gender;
 
 public Person(String name,int age,String gender){
 //creating object of Person
 this.name=name;
 this.age=age;
 this.gender=gender;
 }
 public Person(Person p){
 //copy constructor of Person
 this.name=p.name;
 this.age=p.age;
 this.gender=p.gender;
 }
 //Accessor and Mutator methods for Person
 public String getName(){
 return this.name;
 }
 public int getAge(){
 return this.age;
 }
 public String getGender(){
 return this.gender;
 }
 public void setName(String name){
 this.name=name;
 }
 public void setAge(int age){
 this.age=age;
 }
 public void setGender(String gender){
 this.gender=gender;
 }
}