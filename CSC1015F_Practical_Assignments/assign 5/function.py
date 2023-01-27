# Sketching a function
# Rector Ratsaka
# 19 March 2022

import math
eqn_function = input("Enter a function f(x):\n") #equation of the graph
for y in range(10, -11, -1): # vertical line
    for x in range(-10, 11): # horizontal line
        f_at_x = round(eval(eqn_function))  # y value            
        if x  == 0 and y == 0 and y!=f_at_x: #origin of function
            print('+', end='')
        elif x == 0 and y!=f_at_x:
            print('|', end='')    #print | as vertical line
        elif y == 0 and y!=f_at_x:
            print('-', end='')    # print - as horizontal line
        elif y== f_at_x: #plots(x,y)
            print('o', end='')    # print o to show function    
        else:
            print(' ', end = '')        
    print()