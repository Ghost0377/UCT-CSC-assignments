//HLine class: subclass of VectorObject that draws a horizontal line with given coodinates and length
//RTSREC001
//Rector Ratsaka
//07 October 2022

public class HLine extends VectorObject{
 private int x_length;
public HLine(int anId, int ax, int ay, int x_length){
super(anId,ax,ay);
this.x_length=x_length;
}
@Override
//draw horizontal line
public void draw ( char [][] matrix ){
 for (int i=x;i<x+x_length;i++){
    matrix[y][i]='*';
  }
}
}