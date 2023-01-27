#A programme that uses a recursive function to calculate whether or not a string is a palindrome (reads the same if reversed). 
#Rector Ratsaka
#26 April 2022

def palindrome(string):
 if len(string)<=1:                                           #if string is empty or has 1 letter then it can be reversible.(base case)
  return True
 return string[0]==string[-1] and palindrome(string[1:-1])    #remove 1st and last letter if they are the same until they reach base case   

string=input("Enter a string:\n")
if palindrome(string):
 print("Palindrome!")
else :
 print("Not a palindrome!")  