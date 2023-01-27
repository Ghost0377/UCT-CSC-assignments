#A programme that takes in a list of marks (separated by spaces) and outputs a histogram representation of the marks according to the mark categories at UCT.
#Rector Ratsaka
#18 April 2022

marks = input('Enter a space-separated list of marks:\n').split()

#Replace marks that satisfy given ranges with this variables so that they can be counted easily. 
fail = '<50%'
third = '50% ≤ 3rd < 60%'
lower_second = '60% ≤ lower 2nd < 70%'
upper_second = ' 70% ≤ upper 2nd < 75%'
first = '>=75%'

#count for each different categories
count1 = 0
count2 = 0
count3 = 0
count4 = 0
count5 = 0

for mark in marks:
    if mark<'50' and mark!='100':
        mark = fail           
        count1+=1
    elif '50'<=mark<'60':
        mark = third   
        count2+=1
    elif '60'<=mark<'70':
        mark = lower_second    
        count3+=1    
    elif '70'<=mark<'75':
        mark = upper_second   
        count4+=1 
    elif '75'<=mark or mark=='100':
        mark = first  
        count5+=1            
#print X to show the frequency of each category                     
print(1 ,' |',count5*'X',sep='')
print(2,'+|',count4*'X',sep='')
print(2,'-|',count3*'X',sep='')
print(3, ' |',count2*'X',sep='')
print('F', ' |',count1*'X',sep='')



        