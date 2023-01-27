//A programme that contains a collection of routines for working with integers.
//RTSREC001
//Rector Ratsaka
//07 September 2022

import java.util.*;

public class NumberUtils {
 private NumberUtils() {
 //prevents NumberUtil objects from being created.
 }
 public static int[] toArray(int number) {
 //convert given int of n digits into array of length n.
  String temp = Integer.toString(number);
  int[] numbers = new int[temp.length()];
  for (int i = 0; i < temp.length(); i++) {
    numbers[i] =  Character.getNumericValue(temp.charAt(i));
  }
  return numbers;
 }
 public static int countMatches(int numberA, int numberB){
 //given two int, count matching digits in same position.
   int count = 0;
   int[] numA = toArray(numberA);
   int[] numB = toArray(numberB);
   for (int i=0;i<numA.length;i++){
    if (numA[i]==numB[i]){
     count++;
    }
   }
  return count; 
 }
 public static int countIntersect(int numberA, int numberB){
 //given two int, count matching digits
  int count = 0;
   int[] numA = toArray(numberA);
   int[] numB = toArray(numberB);
   for (int i: numA){
     for (int j: numB){
       if (i==j){
         count++;
    }
   }
   }
  return count;
 }
}
