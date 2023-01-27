//PLine class: subclass of VectorObject that draws a rectangle with given coodinates and lengths
//RTSREC001
//Rector Ratsaka
//07 October 2022


public class PtLine extends VectorObject{
 private int x1;
 private int y1; 
public PtLine(int id, int x, int y, int x1, int y1){
 super(id,x,y);
 this.x1=x1;
 this.y1=y1;
}
@Override
//draw a PtLine
public void draw ( char [][] matrix ){
        int dx=0,dy=0,S1=0,S2=0,j=0,k=0;
         dx = Math.abs(this.x1-this.x);
         dy = Math.abs(this.y1-this.y);
          j=this.x;
          k =this.y;
         S1= sign(x1-x);
         S2 = sign(y1-y);
         int exchange = 0;
         
         if ((dy)>(dx)){
             int temp = dy;
             dy=dx;
             dx=temp;
             exchange =1;
         }
         int e = 2*dy-dx;
         int i;
         matrix[k][j]='*';
         
         for (i=0; i<dx; i++){
        
              while(e>=0){
                  if (exchange==1){
                        j=j+S1;
                       
                  }else{k=k+S2;}
                  e=e-2*dx;
            }
          
             if (e<0){
                 if (exchange==1){
                        k=k+S2;
                   }else{j=j+S1;}
                   e=e+2*dy;
                }
             
             matrix[k][j] = '*';
         }
   }      
         
  
          
          
                    
      
      //returns the sign of the number if n is positive returns 1 if negative -1 otherwise return 0 
      public int sign(int n){
           if (n>0){
               return 1;
           }
           else if(n==0){
              return 0;
           }return -1;
      }
}