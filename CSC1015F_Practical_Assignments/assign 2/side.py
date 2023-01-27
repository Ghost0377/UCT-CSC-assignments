#RTSREC001
#28 February 2022
import math
a = eval(input("Enter the length of side a:\n"))
c = eval(input("Enter the length of side c:\n"))

if a > 0 and c > 0:  
        b = math.sqrt((c*c) - (a*a))        
        print("The length of side b is", b, end='.' )
if c <= 0 or a <= 0:    
        print("Sorry, lengths must be positive numbers.")       