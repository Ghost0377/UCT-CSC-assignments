x = eval(input('Enter the value of x:\n'))
y = eval(input('Enter the value of y:\n'))
z = eval(input('Enter the value of z:\n'))

if x >= 0 and y >= 0:
  ans = (z/(x+y))**3
  print('The answer is', round(ans) ,end='.')
  
if  x < 0 or y < 0:

  print('These values of x and y will cause division by zero.')
 
