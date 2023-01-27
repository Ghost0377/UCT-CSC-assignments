#A programme with the functions for simple Gumatj arithmetic, assuming that all values have at most 2 digits.
#Rector Ratsaka
#17 April 2022
import math

def gumatj_to_decimal(a): #converts a Gumatj number to decimal  
   return int(str(a), 5) 
  
def decimal_to_gumatj(a): #converts a decimal number to Gumatj 
   remainder = ''
   while a >=1:
      remainder+=str(a%5)
      a = (a//5)
   #if a <=4 :
      #num  = a
   #elif a %5 ==0:
      #num = a*2   
   #elif 6<=a<=9:
      #num = a+5
   #elif 11<=a<=14:
      #num = a+10  
   #elif 16<=a<=19:
      #num = a+15    
   #elif 21<=a<=24:
      #num = a+20
   #return num 

def gumatj_add(a, b): #converts a decimal number to Gumatj
   return decimal_to_gumatj(gumatj_to_decimal(a) + gumatj_to_decimal(b))
       
def gumatj_multiply(a, b): #multiples 2 Gumatj numbers
   return decimal_to_gumatj(gumatj_to_decimal(a) * gumatj_to_decimal(b))
    
if __name__=='__main__':
   main()