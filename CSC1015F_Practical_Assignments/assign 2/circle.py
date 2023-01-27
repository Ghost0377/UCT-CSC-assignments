#Calculating the value of Pi
#RTSREC001
#28 February 2022

import math
pi = 2*(2/math.sqrt(2))*(2/math.sqrt(2+math.sqrt(2)))*(2/math.sqrt(2+math.sqrt(2+math.sqrt(2))))
print("Approximation of pi:",round(pi, 4))
r = eval(input("Enter the radius: \n" ))
A = pi*r*r
print("Area:",round(A, 4))
      
