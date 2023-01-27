//Rectangle class: subclass of VectorObject that draws a rectangle with given coodinates and lengths
//RTSREC001
//Rector Ratsaka
//07 October 2022

public class Rectangle extends VectorObject{
 private int x_length;
 private int y_length;
public Rectangle(int anId, int ax, int ay, int x_length, int y_length){
super(anId,ax,ay);
this.x_length=x_length;
this.y_length=y_length;
} 
@Override
//draw a rectangle
public void draw ( char [][] matrix ){
 for (int i=y;i<y+y_length;i++){
   for (int j=x;j<x+x_length;j++){
    matrix[i][j]='*';
  }
 }
}
}