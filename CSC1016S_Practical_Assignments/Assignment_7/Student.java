//A programme of Student:subclass of Person
//RTSREC001
//Rector Ratsaka
//19 September 2022

public class Student extends Person{
//instant variables
 private String nameOfInstitution;
 private String programOfStudy;
 private int yearOfStudy;
 private String hobbies;
 
 public Student(String name,int age,String gender,String nameOfInstitution,String programOfStudy,int yearOfStudy,String hobbies){
 //creating object of Student and using variables from superclass:Person
 super(name,age,gender);
 this.nameOfInstitution=nameOfInstitution;
 this.programOfStudy=programOfStudy;
 this.yearOfStudy=yearOfStudy;
 this.hobbies=hobbies;
 }
 public Student(Student s){
 //copy constructor of Student
 super(s);
 this.nameOfInstitution=s.nameOfInstitution;
 this.programOfStudy=s.programOfStudy;
 this.yearOfStudy=s.yearOfStudy;
 this.hobbies=s.hobbies;
 }
 //Accessor and Mutator methods for Student
 public String getNameOfInstitution(){
 return this.nameOfInstitution;
 }
 public String getProgramOfStudy(){
 return this.programOfStudy;
 }
 public int getYearOfStudy(){
 return this.yearOfStudy;
 }
 public String getHobbies(){
 return this.hobbies;
 }
 public void setNameOfInstitution(String nameOfInstitution){
 this.nameOfInstitution=nameOfInstitution;
 }
 public void setProgramOfStudy(String programOfStudy){
 this.programOfStudy=programOfStudy;
 }
 public void setYearOfStudy(int yearOfStudy){
 this.yearOfStudy=yearOfStudy;
 }
 public void setHobbies(String hobbies){
 this.hobbies=hobbies;
 }
}