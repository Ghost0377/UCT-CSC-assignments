//A programme that 
//RTSREC001
//Rector Ratsaka
//13 September 2022
import java.util.*;

public class Vector {
 private double x;
 private double y;
 private double[] vector;
 public Vector(double x,double y) {
 //Create an array to store vectors from input. 
 this.x=x;
 this.y=y;
 vector = new double[2];
 vector[0]=x;
 vector[1]=y;
 }
 public double getMagnitude() {
 //Obtain magnitude of vectors: v=sqrt(x^2+y^2).
  double answer = Math.sqrt(x*x+y*y);
  return answer;
 }
 public Vector add(Vector other) {
 //add two vectors:(vx+vx,vy+vy).
  Vector answer = new Vector(vector[0]+other.x,vector[1]+other.y);
  return answer;
 }
 public Vector multiply(double m) {
 //multiply a vector by m:(vy*m,vy*m).
 Vector answer = new Vector(vector[0]*m,vector[1]*m) ;
 return answer;
 }
 public double dotProduct(Vector other) {
 //multiply vectors and add them:(x1*x2+y1*y2).
 double answer = vector[0]*other.x+vector[1]*other.y;
 return answer;
 }
 public String toString() {
 //Return string representation of vector.
  return "v = ("+String.format("%.2f",this.x)+", "+ String.format("%.2f",this.y)+")";
 }
}