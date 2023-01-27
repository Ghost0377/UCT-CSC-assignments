# A programme that uses a recursive function to count the number of pairs of consecutive characters in a string.
#Rector Ratsaka
#26 April 2022

def pairs(string):
 if len(string) <= 1:             #base case, there won't be pairs.
  return 0                         
 if string[0] == string[1]:       #if the 1st and 2nd letter are the same count 1 and remove them.
  return 1 + pairs(string[2:])
 else:
  return pairs(string[1:])        #check 2nd and 3rd if 1st and second are not the same.
    
string = input('Enter a message:\n')
print('Number of pairs:',str(pairs(string)))