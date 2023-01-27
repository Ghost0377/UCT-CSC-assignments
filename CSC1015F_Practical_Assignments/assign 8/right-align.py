#A programme that align a list of strings.
#Rector Ratsaka
#17 April 2022

words = []
str = input('Enter strings (end with DONE):\n')
while str != 'DONE':
    words.append(str) #store input strings to a list.
    str = input('')
print()
print('Right-aligned list:')
for word in words: 
#print list in column and the longest strings determine the adjustment/alignment to the right.
    print(word.rjust(len(max(words, key = len))))
    
    
    
 