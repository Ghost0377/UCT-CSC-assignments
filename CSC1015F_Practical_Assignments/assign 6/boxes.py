#creating hollow boxes of stars.
#Rector Ratsaka
#01 April 2022

import math
def print_square():
    asterisk1 =''
    for r in range(5): #length
        for c in range(5): #width
            if r==0 or r==5-1 or c==0 or c==5-1:
                asterisk1 +='* '    
            else:
                asterisk1 +='  '  
        asterisk1 +='\n'
    return asterisk1 #return a string containing a 5x5 box
              
def print_rectangle(width, height):  
    for r in range(height):
        for c in range(width):
            if r==0 or r==height-1 or c==0 or c==width-1:
                print('*',end=' ')
            else:
                print(' ',end=' ')
        print() #prints a box on the screen with given width and height
       
def get_rectangle(width, height):
    asterisk2 = ''
    for r in range(height):
        for c in range(width):
            if r==0 or r==height-1 or c==0 or c==width-1:
                asterisk2 += '* '    
            else:
                asterisk2 += '  '  
        asterisk2 += '\n'
    return asterisk2  # returns a string containing a box with given width and height
          
        
if  __name__ == '__main__':
    main()