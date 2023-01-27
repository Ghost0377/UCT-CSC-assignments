import java.util.*;
public class TestNums{
 public static void main(String[] args){
 int num1 = 39628;
 int num2 = 79324;
 System.out.println(Arrays.toString(NumberUtils.toArray(num1)));
 System.out.println(NumberUtils.countMatches(num1,num2));
 System.out.println(NumberUtils.countIntersect(num1,num2));
 }
}