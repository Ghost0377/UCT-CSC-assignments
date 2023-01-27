//VLine class: subclass of VectorObject that draws a vertical line with given coodinates and length
//RTSREC001
//Rector Ratsaka
//07 October 2022

public class VLine extends VectorObject{
 private int y_length;
public VLine(int anId, int ax, int ay,int y_length){
super(anId,ax,ay);
this.y_length=y_length;
}
@Override
//draw vertical line
public void draw ( char [][] matrix ){
 for (int i=y;i<y+y_length;i++){
    matrix[i][x]='*';
  }
}
}